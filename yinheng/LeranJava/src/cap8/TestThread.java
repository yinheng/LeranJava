package cap8;

/**
 * Created @2017/2/25 16:59
 */
public class TestThread {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        r.start();

        Runner2 r2 = new Runner2();
        Thread t = new Thread(r2);
        t.start();
        for(int i = 0; i <= 100; i ++) {

            System.out.println("main=====" + i);
        }

    }
}

class Runner1 extends Thread {
    @Override
    public void run() {
       for(int i = 0; i <= 100; i ++){
           System.out.println("Runner1=====" + i);

        }

    }
}
class Runner2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 100; i ++) {
            System.out.println("Runner2===" + i);

        }
    }
}
