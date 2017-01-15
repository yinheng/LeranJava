package cap3;

/**
 * Learning static
 */
public class Cat {

    static int sid = 0;

    int id = 0;

    String name;

    Cat(String name) {
        this.name = name;
        sid++;

    }

    public void info() {
        int i = 0;
        System.out.println("my name is " + name + ", sid = " + sid);
    }

    public static int count() {
        return sid;
    }

    public static void main(String[] arg) {

        Cat mimi = new Cat("mimi");
        mimi.info();

        Cat pipi = new Cat("pipi");
        pipi.info();

        System.out.println(Cat.count());
    }
}
