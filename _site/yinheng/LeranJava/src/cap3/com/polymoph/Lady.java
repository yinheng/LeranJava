package cap3.com.polymoph;

/**
 * Learning
 */
public class Lady {
    String name;
    Animal pet;

    Lady(String name, Animal a) {
        this.name = name;
        pet = a;
    }

    public void petEnjoy() {
        pet.enjoy();
    }

    abstract class Animal {
        abstract void enjoy();
    }
}
