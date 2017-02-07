package cap3.com.polymoph;

/**
 * Learning
 */
public class Dog extends Animal {
    String furColor;

    Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public void enjoy() {
        System.out.println("dog enjoy...");

    }
}
