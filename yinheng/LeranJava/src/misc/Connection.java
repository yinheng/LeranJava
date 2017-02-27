package misc;

/**
 * Created @2017/2/27 17:08
 */
public abstract class Connection {
    private Session session;

    public Connection(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    abstract void close();

    abstract void sendMessage(String message);
}
