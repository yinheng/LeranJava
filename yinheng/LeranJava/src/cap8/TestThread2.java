package cap8;

/**
 * Created @2017/2/25 18:30
 */
public class TestThread2 {
    public static void main(String[] args) {
        Thread myThread3 = new MyThread3();
        myThread3.start();
        for(int i = 0; i <= 100; i ++) {
            System.out.println("main thread" + i);
        }


    }

}
class MyThread3 extends Thread {
    public void run() {
        for(int i = 0; i <= 100; i ++) {
            System.out.println("My thread" + i);

        }
        System.out.println(Thread.currentThread().isAlive());
    }
}




