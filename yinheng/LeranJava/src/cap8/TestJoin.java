package cap8;

/**
 * Created @2017/2/25 17:52
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1("abc");
        thread1.start();
        try{
            thread1.join();
        }catch(InterruptedException e) {

        }
        for(int i = 0; i <= 10; i ++) {
            System.out.println("i am main thread");

        }

    }
}
class MyThread1 extends Thread {
     MyThread1(String s) {
        super(s);

    }
    public void run() {
         for(int i = 0; i <= 10; i ++) {
             System.out.println("i am Thread" + getName());
             try{
                 sleep(1000);
             }catch(InterruptedException e) {
                 return;
             }

         }
    }

}
