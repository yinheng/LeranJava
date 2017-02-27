package misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created @2017/2/27 17:10
 */
public class ConnectionManager {

    final List<Connection> connections = new ArrayList<>();

    public void addConnection(Connection connection) {
        synchronized (connections) {
            connections.remove(connection);
            connections.add(connection);
        }
    }

    public void broadcast(String message) {
        synchronized (connections) {
            for (Connection c : connections) {
                c.sendMessage(message);
            }
        }
    }
}
