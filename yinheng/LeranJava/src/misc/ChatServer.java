package misc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created @2017/2/26 18:51
 */
public class ChatServer extends Frame {

    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        server.startServer();
    }


    TextField tf = new TextField();

    TextArea ta = new TextArea();

    DataOutputStream dos;

    boolean running;

    public void startServer() throws Exception {

        running = true;

        launchFrame();

        ServerSocket s = new ServerSocket(6666);

        Socket ss = s.accept();
        onNewClientConnected(ss.getInetAddress());

        dos = new DataOutputStream(ss.getOutputStream());

        DataInputStream dis = new DataInputStream(ss.getInputStream());

        while (running) {
            String received = dis.readUTF();
            onMesssageReceived(received);
        }

        dis.close();
    }

    public void launchFrame() {
        setLocation(400, 300);
        setSize(300, 300);
        add(tf, BorderLayout.SOUTH);
        add(ta, BorderLayout.NORTH);
        this.pack();
        setTitle("Server");

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent arg0) {
                System.out.println("Closing");

                try {
                    dos.flush();
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                running = false;
                System.exit(0);
            }
        });

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                onEnter();
            }
        });
        setVisible(true);
    }

    private void onMesssageReceived(String msg) {
        StringBuffer sb = new StringBuffer(ta.getText());
        sb.append("\n");
        sb.append("<-------");
        sb.append(msg);
        sb.append("\t");
        sb.append(new Date());

        ta.setText(sb.toString());
    }

    private void onEnter() {
        StringBuffer sb = new StringBuffer(ta.getText());
        sb.append("\n");
        sb.append("------>");
        sb.append(tf.getText());
        sb.append("\t");
        sb.append(new Date());

        ta.setText(sb.toString());


        // Send out
        try {
            dos.writeUTF(tf.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        tf.setText("");
    }

    private void onNewClientConnected(InetAddress address) {
        StringBuilder stringBuilder = new StringBuilder(ta.getText());
        stringBuilder.append("\n");
        stringBuilder.append("新客户端上线：" + address.getHostName());
        ta.setText(stringBuilder.toString());
    }

}
