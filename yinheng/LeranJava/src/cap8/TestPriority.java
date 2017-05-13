package cap8;

/**
 * Created @2017/2/25 18:12
 */
public class TestPriority {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.setPriority(Thread.NORM_PRIORITY + 3);
        thread1.start();
        thread2.start();

    }
}
class T1 implements Runnable {
    public void run() {
        for(int i = 0; i <= 1000; i ++) {
            System.out.println("T1" + i);
        }
    }
}

class T2 implements Runnable {
    public void run() {
        for(int i = 0; i <= 1000; i ++) {
            System.out.println("T2" + i);
        }
    }
}
