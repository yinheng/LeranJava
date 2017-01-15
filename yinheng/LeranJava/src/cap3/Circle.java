package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
public class Circle {

    Point o;
    double radius;

    public Circle() {
        o = new Point();
        radius = 1.0;
    }

    public Circle(Point p) {
        o = p;
        radius = 1.0;
    }

    public Circle(Point p, double r) {
        o = p;
        radius = r;
    }

    public void setO(Point _o) {
        o = _o;
    }

    public void setO(int x, int y) {
        o.setX(x);
        o.setY(y);
    }

    public boolean contains(Point p) {
        if ((p.x - o.x) > 0) {
            return true;
        } else
            return false;
    }
}
