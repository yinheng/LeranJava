package cap8;

/**
 * Created @2017/2/25 19:19
 */
public class TestSync implements Runnable {

    Timer timer = new Timer();

    public static void main(String... args) {
        TestSync T = new TestSync();
        Thread t1 = new Thread(T);
        Thread t2 = new Thread(T);

        t1.setName("XXXX");
        t2.setName("YYYY");

        t1.start();
        t2.start();

    }

    public void run() {
        timer.add();
    }
}


class Timer {

    int num = 0;


    public void add() {
        synchronized (this) {
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "-当前数字" + num);
        }
    }
}
