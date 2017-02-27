package misc;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created @2017/2/27 17:28
 */
public class SimpleConnection extends Connection {

    public SimpleConnection(Session session) {
        super(session);
    }

    @Override
    void close() {
        try {
            getSession().getSocket().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void sendMessage(String message) {
        try {
            DataOutputStream dos = new DataOutputStream(getSession().getSocket().getOutputStream());
            dos.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
