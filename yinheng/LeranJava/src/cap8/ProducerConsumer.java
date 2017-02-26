package cap8;

/**
 * Created @2017/2/26 11:07
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class WoTou {
    int id;

    WoTou(int id) {
        this.id = id;
    }

    public String toString() {
        return "WoTou" + id;
    }
}

class SyncStack {
    int index = 0;
    WoTou[] wotou = new WoTou[6];

    public synchronized void push(WoTou wt) {
        if (index == wotou.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        wotou[index] = wt;
        index++;
        this.notify();

    }

    public synchronized WoTou pop() {
        if (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        this.notify();
        return wotou[index];
    }
}

class Producer implements Runnable {
    SyncStack ss = null;

    Producer(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        for (int i = 0; i <= 20; i++) {
            WoTou wt = new WoTou(i);
            ss.push(wt);
            System.out.println("生产了" + wt);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Consumer implements Runnable {

    SyncStack ss = null;

    Consumer(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        for (int i = 0; i <= 20; i++) {
            WoTou wt = ss.pop();
            System.out.println("消费了" + wt);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}