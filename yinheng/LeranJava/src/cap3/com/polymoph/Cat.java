package cap3.com.polymoph;

/**
 * Learning
 */
public class Cat extends Animal {
    String eyeColor;

    Cat(String name, String eyeColor) {
        super(name);
        this.eyeColor = eyeColor;
    }

    public void enjoy() {
        System.out.println("cat enjoy...");
    }

}
