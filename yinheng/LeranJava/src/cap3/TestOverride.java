package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
public class TestOverride {
    public static void main(String[] arg) {
        Pig pig = new Pig();
        pig.eat();
        pig.setSize(10);

        // 2.
        new Pig().eat();
        new Pig().setSize(21);

    }
}
class Pig extends  Animal {
    public void eat() {
        System.out.println("Pig eat");
    }
}
