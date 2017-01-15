/**
 * Created by guohao4 on 2017/1/8.
 */
public class TestFab2 {
    public static void main(String[] args) {
        System.out.println(f(40));
    }

    public static long f(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        long f1 = 1;
        long f2 = 1;
        long f = 0;
        for (int i = 0; i <= index - 2; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }
}
