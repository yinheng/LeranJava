package cap3;

/**
 * Learning
 */
class Monkey {
    public String toString() {
        return "I'm a happy monkey";
    }
}

public class TestToString {
    public static void main(String[] arg) {
        Monkey m = new Monkey();
        System.out.print("m:" + m.toString());
    }
}
