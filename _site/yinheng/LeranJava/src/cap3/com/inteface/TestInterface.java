package cap3.com.inteface;

/**
 * Learning
 */
interface Singer extends Closable, Openable{
    public static final String name = "singer";

    public void sing();

    public void sleep();

}

interface Painter {
    public void paint();

    public void eat();
}

interface Closable {
    void close();
}

interface Openable {
    boolean open();
}

abstract class AbsStudent implements Painter, Singer{
    @Override
    public void sing() {
        System.out.println("sing");
    }
}

class EmptyStudent extends AbsStudent {

    @Override
    public void sing() {
        System.out.println("SING2");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void paint() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void close() {

    }

    @Override
    public boolean open() {
        return false;
    }
}

class Student implements Singer, Painter {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void sing() {
        System.out.println("sing");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void paint() {
        System.out.println("PANNT");
    }

    public void eat() {
        System.out.println("EAT");
    }

    @Override
    public void close() {
        System.out.println("CLOSED");
    }

    @Override
    public boolean open() {
        return false;
    }
}

public class TestInterface {
    public static void main(String[] arg) {
        Singer s = new Student("si");
        s.sing();
        s.sleep();

        Painter p = new Student("pi");
        p.paint();
        p.eat();

    }
}
