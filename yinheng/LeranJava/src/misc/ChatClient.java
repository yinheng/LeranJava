package misc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class ChatClient extends Frame {

    TextField tf = new TextField();

    TextArea ta = new TextArea();

    DataOutputStream dos;

    public static void main(String[] args) {
        new ChatClient().startClient();
    }

    public void startClient() {
        launchFrame();
        try {
            startTcp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startTcp() throws Exception{
        Socket s = new Socket("127.0.0.1", 6666);

        OutputStream os = s.getOutputStream();
        dos = new DataOutputStream(os);

        onConnectedToServer(s);
        DataInputStream dis = new DataInputStream(s.getInputStream());

        while (true) {
            String received = dis.readUTF();
            onMesssageReceived(received);
        }
    }

    public void launchFrame() {
        setLocation(400, 300);
        setSize(300, 300);
        add(tf, BorderLayout.SOUTH);
        add(ta, BorderLayout.NORTH);
        this.pack();
        setTitle("Client");

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent arg0) {
                System.out.println("Closing");

                try {
                    dos.flush();
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

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

    private void onConnectedToServer(Socket socket) {
        String ipInfo = socket.getInetAddress().getHostName();
        StringBuilder stringBuilder = new StringBuilder(ta.getText());
        stringBuilder.append("\n");
        stringBuilder.append("服务器连接上了：" + ipInfo + "\t" + new Date());
        ta.setText(stringBuilder.toString());
    }

}
