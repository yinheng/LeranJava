/**
 * Created by guohao4 on 2017/1/7.
 */
public class TestMethod {
    public static void main(String[] arg) {
        m1();
        String result = m2();
        m4(result);
    }

    public static void m1() {
        System.out.print(2);
    }
    public static String m2() {
        String name = "Hello Kitty";
        return name;
    }

    public static void m3() {
        for (int i =0; i < 100; i ++) {

        }
    }

    public static void m4(String m) {
        System.out.print(m);
    }

}
