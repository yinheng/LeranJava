package cap8;

import java.util.Date;

/**
 * Created @2017/2/25 20:48
 */
public class TestSync2 implements Runnable {

    int b = 0;

    Object lock = new Object();

    void m1() {
        synchronized (lock) {
            System.out.println("m1:" + b + "-" + new Date());
            b = 1000;
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {

            }
            System.out.println("b = " + b + "-" + new Date());
        }
    }

    void m2() {
        System.out.println("m2:" + b + "-" + new Date());
        b = 2000;
    }

    @Override
    public void run() {
        m1();
    }

    public static void main(String... args) {
        TestSync2 s2 = new TestSync2();

        Thread t = new Thread(s2);
        t.start();

        s2.m2();

        System.out.println("main method: " + s2.b);
    }
}
