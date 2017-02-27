package misc;

/**
 * Created @2017/2/27 17:11
 */
public class ServerUI extends UI {
    @Override
    public void beforePacking() {
        super.beforePacking();
        setTitle("Server");
    }
}
