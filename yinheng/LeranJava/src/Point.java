/**
 * Created by guohao4 on 2017/1/14.
 */
public class Point {

    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public long distance() {
        long distance;
        distance = x * y * z;
        return distance;
    }

    public void printSelf() {
        String s =  "My type is Point{" +
                "my.x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
        System.out.println(s);
    }
}

 class PointTest {
    public static void main(String[] arg) {
        // 1.
        Point point = new Point(1,2,3);
        point.printSelf();

        // 2.
        point.setX(4);
        point.setY(5);
        point.setZ(6);
        point.printSelf();

        System.out.println(new Point(9, 10, 11).getY());

        // 3.
        long dis = point.distance();
        System.out.println(dis);
    }
 }
