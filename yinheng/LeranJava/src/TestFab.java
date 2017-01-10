/**
 * Created by guohao4 on 2017/1/8.
 */
public class TestFab {
    public static void main(String[] args) {
        System.out.println(f(40));
    }

    public static long f(int n) {
        if(n ==1 || n == 2) {
            return 1;
        }
        else
            return f(n -1) + f(n -2);
    }
}
