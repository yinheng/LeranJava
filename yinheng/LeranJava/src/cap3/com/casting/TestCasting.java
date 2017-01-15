package cap3.com.casting;

/**
 * Learning
 */
public class TestCasting {

    public static void main(String[] args) {

        Animal a = new Animal("animal");
        Cat cat = new Cat("cat", "yellow");
        Dog dog = new Dog("dog", "black");

        TestCasting test = new TestCasting();
        test.f(a);
        test.f(cat);
        test.f(dog);


        System.out.println(a instanceof Animal);
        System.out.println(cat instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Dog);
        System.out.println(a instanceof Cat);

        a = new Dog("bigyellow", "yellow");
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a.name);

        Dog d1 = (Dog) a;
        System.out.println(d1.furColor);


    }

    public void f(Animal a) {
        System.out.println("name: " + a.name);
        if (a instanceof Cat) {
            Cat cat1 = (Cat) a;
            System.out.println("eyeColor: " + cat1.eyesColor);
        }
        if (a instanceof Dog) {
            Dog dog1 = (Dog) a;
            System.out.println("furColor: " + dog1.furColor);
        }

    }
}
