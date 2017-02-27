package misc;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created @2017/2/26 18:51
 */
public class ChatServer {

    private ServerUI mUI;
    private ConnectionManager mConnectionManager;

    private boolean mRunning;

    public ChatServer() {
        mUI = new ServerUI();
        mConnectionManager = new ConnectionManager();
    }

    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        server.startServer();
    }

    public void startServer() throws Exception {

        mUI.launch();

        mRunning = true;

        ServerSocket s = new ServerSocket(6666);

        while (mRunning) {
            Socket ss = s.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    onNewClientConnected(ss);
                }
            }).start();
        }
    }

    private void onNewClientConnected(Socket socket) {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String clientName = dis.readUTF();
            StringBuffer buffer = mUI.getDisplayText();
            buffer.append("New client connected:").append(clientName).append(new Date());
            mUI.setDisplayText(buffer.toString());

            // Add session
            Session from = new Session(socket, clientName);
            mConnectionManager.addConnection(new SimpleConnection(from));

            while (mRunning) {
                String newMessage = dis.readUTF();
                onMessageReceived(from, newMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
            mRunning = false;
        }
    }

    private void onMessageReceived(Session from, String message) {
        mConnectionManager.broadcast(from.getClientId() + ":" + message);
    }

}
