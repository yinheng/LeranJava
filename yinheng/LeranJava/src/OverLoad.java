/**
 * Created by guohao4 on 2017/1/14.
 */
public class OverLoad {
    public static void main(String[] arg) {
        Apple apple1 = new Apple();
        apple1.info();

        Apple apple2 = new Apple(2);
        apple2.info();

        Apple apple3 = new Apple("red", 3, 3.2f);
        apple3.info();

        apple1.changeColor();
        apple1.info();

        apple2.changeColor("red");
        apple2.info();
    }
}

class Apple {

    String color;
    int size;
    float weight;

    public Apple() {
        color = "green";
        size = 1;
        weight = 2.2f;
    }

    public Apple(int _size) {
        color = "blue";
        size = _size;
        weight = 2.2f;
    }

    public Apple(String color, int size, float weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }


    public void changeColor() {
        color = "black";
    }

    public void changeColor(String _color) {
        color = _color;
    }

    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }

    public void info() {
        System.out.println(toString());
    }
}
