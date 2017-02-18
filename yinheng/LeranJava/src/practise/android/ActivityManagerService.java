package practise.android;

/**
 * Learning
 */
public class ActivityManagerService extends Service {

    public void start() throws StartException {
        System.out.println("ActivityManagerService启动");
        startLauncher();
    }

    private void startLauncher() {
        new Launcher().start();
    }
}
