package cap4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Learning
 */
public class TestException {

    public static void main(String[] arg ) throws FileNotFoundException {
        try {
            System.out.println(1/0);
            System.out.println("hello world");
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hello world2222");

        try {
            c();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String a = "dwdww";
        a.substring(100);
    }


    public static void read(String path) throws FileNotFoundException{
        if (path == null) {
            throw new NullPointerException();
        }

        if (path.length() == 0) {
            throw new FileNotFoundException();
        }
    }

    static void c() throws IOException {
        b();
    }

    static void b() throws IOException {
        a();
    }

    static void a() throws IOException{
         throw new IOException("I am an ex.");
    }
}
