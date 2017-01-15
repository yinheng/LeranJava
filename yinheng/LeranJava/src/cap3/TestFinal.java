package cap3;

/**
 * Learning
 */
public class TestFinal {

    public static void main(String... args) {

        T t = new T(1000);
        System.out.println(t.FINAL_I);
        System.out.println(t.cat);

        System.out.println(T.STATIC_I);
        System.out.println(T.SFI);
    }

}


class T {

    int i;

    final int FINAL_I; // Init now or in Constructor...

    static int STATIC_I;

    static final int SFI = 19999; // Init now!!!

    final Cat cat = new Cat("MIAO");

    public T(int FINAL_I) {
        this.FINAL_I = FINAL_I;
    }

    final void test(final Cat cat) {
        cat.info();
        // cat = new Cat("XXX");
    }

    void noFinalTest() {
        final Cat lcat = new Cat("LLL");
        test(lcat);
    }
}

final class TT extends T {

    public TT(int FINAL_I) {
        super(FINAL_I);
    }

    void noFinalTest() {
        super.noFinalTest();

        int z = this.FINAL_I;
    }
}

//class TTT extends TT {
//
//}

/* final */ abstract class TTT {
    public void test() {
        // Noop.
    }
}