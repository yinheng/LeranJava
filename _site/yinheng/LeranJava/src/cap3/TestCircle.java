package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
public class TestCircle {

    public static void main(String[] arg) {
        Circle circle = new Circle(new Point(3, 4), 5);
        Point point = new Point(2, 2);
        boolean r = circle.contains(point);
        System.out.println(r);
    }
}
