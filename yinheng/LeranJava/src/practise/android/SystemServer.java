package practise.android;

/**
 * Learning
 */
public class SystemServer {

    int retryCount;

    public void start() {
        retryCount++;
        try {
            new PackageManagerService().start();
            new SensorManagerService().start();
            new ActivityManagerService().start();
            retryCount = 0;
        } catch (StartException e) {
            System.out.println("Catch StartException!!! restarting...");
            if (retryCount < 3) {
                start();
            }
        }
    }
}
