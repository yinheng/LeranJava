package cap8;

/**
 * Created @2017/2/25 19:59
 */
public class TestDeadLock implements Runnable {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    int flag = 0;

    public static void main(String... args) {
       TestDeadLock l1 = new TestDeadLock();
       l1.flag= 0;

       TestDeadLock l2 = new TestDeadLock();
       l2.flag = 1;

       Thread t1 = new Thread(l1);
       Thread t2 = new Thread(l2);

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (lock1) {
                System.out.println("Thread1 Locking 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }

                synchronized (lock2) {
                    System.out.println("Thread1 Locking 2");
                }
            }
        } else {
            synchronized (lock2) {
                System.out.println("Locking 2");
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {

                }

                synchronized (lock1) {
                    System.out.println("Locking 1");
                }
            }
        }
    }
}




