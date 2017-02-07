package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
class Animal {

    String color = "RED";
    int size;

    public void eat() {
        System.out.println("eat");

    }

    public void setSize(int _size) {
        size = _size;
    }

    public String getColor() {
        return color;
    }

}

class Dog extends Animal {

    float weight;

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

}

public class TestExtends {
    public static void main(String[] arg) {
        Dog dog = new Dog();
        dog.eat();
        dog.setSize(3);
        System.out.println(dog.getColor());
    }

}
