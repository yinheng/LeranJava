package misc;

import java.net.Socket;

/**
 * Created @2017/2/27 17:07
 */
public class Session {

    private Socket socket;
    private String clientId;
    private long upTime;

    public Session(Socket socket, String clientId) {
        this.socket = socket;
        this.clientId = clientId;
        this.upTime = System.currentTimeMillis();
    }

    public Socket getSocket() {
        return socket;
    }


    public String getClientId() {
        return clientId;
    }

    public long getUpTime() {
        return upTime;
    }

    @Override
    public String toString() {
        return "Session{" +
                "socket=" + socket +
                ", clientId='" + clientId + '\'' +
                ", upTime=" + upTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Session session = (Session) o;

        if (upTime != session.upTime) return false;
        if (socket != null ? !socket.equals(session.socket) : session.socket != null) return false;
        return clientId != null ? clientId.equals(session.clientId) : session.clientId == null;
    }

    @Override
    public int hashCode() {
        int result = socket != null ? socket.hashCode() : 0;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (int) (upTime ^ (upTime >>> 32));
        return result;
    }
}
