package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
public class TestAcess {

    private int size = 0;

    int age = 0;
    protected String name;
    public int id = 1;

    protected void set() {
        System.out.println("SUPER SET");
        this.name = "";
    }

}

class Access extends TestAcess {
    int sid = 0;

    void test() {

        age = 2;
        super.name = "SSS";
        id = 0;

        super.set();
        name = "XXX";

        System.out.println(super.name);
    }

    @Override
    protected void set() {
        super.set();
        System.out.println("MY SET");
    }
}

class MyTest {
    public static void main(String[] arg) {
        TestAcess a = new TestAcess();

        a.id = 1;
        a.age = 2;
        a.name = "";


        Access access = new Access();

        access.id = 9;
        access.age = 100;
        access.name = "SSS";

        access.test();
    }

}


