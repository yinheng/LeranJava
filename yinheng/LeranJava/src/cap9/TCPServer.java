package cap9;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created @2017/2/26 17:52
 */
public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(6666);
        while(true) {
            Socket ss = s.accept();
            DataInputStream dis = new DataInputStream(ss.getInputStream());
            System.out.println(dis.readUTF());
            System.out.println("a client connect!");
            dis.close();
            ss.close();
        }

    }
}
