package misc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created @2017/2/27 16:58
 */
public class ClientIdFactory {
    private static AtomicInteger id = new AtomicInteger(0);

    static String getNextId() {
        return "Client-" + id.incrementAndGet();
    }
}
