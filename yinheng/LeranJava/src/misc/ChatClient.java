package misc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class ChatClient {

    private ClientUI mUI;

    private DataOutputStream mDos;

    private String mClientId = ClientIdFactory.getNextId();

    public ChatClient() {
        mUI = new ClientUI(mClientId) {
            @Override
            public void onEnter() {
                super.onEnter();
                ChatClient.this.onEnter();
            }
        };
    }

    public static void main(String[] args) {
        new ChatClient().startClient();
    }

    public void startClient() {
        mUI.launch();
        try {
            startTcp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startTcp() throws Exception {
        Socket s = new Socket("127.0.0.1", 6666);

        OutputStream os = s.getOutputStream();
        mDos = new DataOutputStream(os);

        onConnectedToServer(s);
        DataInputStream dis = new DataInputStream(s.getInputStream());

        // Say user name to server
        mDos.writeUTF(mClientId);

        while (true) {
            String received = dis.readUTF();
            onMesssageReceived(received);
        }
    }

    private void onMesssageReceived(String msg) {
        StringBuffer sb = mUI.getDisplayText();
        sb.append("\n");
        sb.append(msg);
        sb.append("\t");
        sb.append(new Date());
        mUI.setDisplayText(sb.toString());
    }

    private void onEnter() {
        // Send out
        try {
            mDos.writeUTF(mUI.getEditText().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }

        mUI.clearEdit();
    }

    private void onConnectedToServer(Socket socket) {
        String ipInfo = socket.getInetAddress().getHostName();
        StringBuilder stringBuilder = new StringBuilder(mUI.getDisplayText());
        stringBuilder.append("服务器连接上了：").append(ipInfo).append("\t").append(new Date());
        mUI.setDisplayText(stringBuilder.toString());
    }

}
