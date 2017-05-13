package cap8;

import java.util.Date;

/**
 * Created @2017/2/25 17:20
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(10000);
            // 10s
            t.interrupt();
        }catch(InterruptedException e) {
           e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    public void run() {
        while (true) {
            System.out.println("====" + new Date());

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
