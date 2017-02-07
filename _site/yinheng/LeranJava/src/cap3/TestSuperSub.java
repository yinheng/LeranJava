package cap3;

/**
 * Learning 继承中的构造方法
 */

class SuperClass {

    SuperClass() {
        System.out.println("SuperClass()");
    }


    SuperClass(int n) {
        System.out.println("SuperClass" + n);
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super(300);
        System.out.println("SubClass()");
    }

    SubClass(int n) {
        super();
        System.out.println("SubClass" + n);
    }
}

public class TestSuperSub {
    public static void main(String[] arg) {
        SubClass c1 = new SubClass();
        SubClass c2 = new SubClass(200);

    }
}
