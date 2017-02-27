package misc;

/**
 * Created @2017/2/27 17:38
 */
public class ClientUI extends UI {

    String id;

    public ClientUI(String id) {
        this.id = id;
    }

    @Override
    public void beforePacking() {
        super.beforePacking();
        setTitle(id);
    }
}
