import java.util.Objects;

/**
 * Created by guohao4 on 2017/1/7.
 */
public class TestSwitch {
    public static void main(String... arg) {
        int i = 8;
        switch (i) {
            case 8:
                print(2);
                break;
            case 3:
                print(3);
            case 4:
                print(4);
            default:
        }
    }

    public static void print(int i) {
        System.out.println(i);
    }
}
