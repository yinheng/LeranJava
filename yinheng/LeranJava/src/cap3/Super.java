package cap3;

/**
 * Learning Super
 */
class FatherClass {

    public int value;
    public String name;

    public void f() {
        value = 100;
        name = "SUPER";
        System.out.println("father value " + value);
    }
}

class ChildClass extends FatherClass {

    public int value;

    public void f() {
        super.f();
        value = 200;
        name = "this";
        System.out.println("child value" + value);
        System.out.println(super.value);
        System.out.println(value);
        System.out.println(name);
    }
}

public class Super {
    public static void main(String[] arg) {
        ChildClass child = new ChildClass();
        child.f();
    }
}
