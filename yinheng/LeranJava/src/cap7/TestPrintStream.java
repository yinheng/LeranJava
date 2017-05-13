package cap7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created @2017/2/24 19:53
 */
public class TestPrintStream {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("D:\\nick\\java_code\\People.java");
            ps = new PrintStream(fos);

        }catch(IOException e) {
            e.printStackTrace();

        }
        if(ps != null) {
            System.setOut(ps);
        }

        int ln = 0;
        for(char c = 0; c <= 6000; c++) {
            System.out.println("c" + c);
            if(ln++ >= 100) {
                System.out.println();
                ln = 0;
            }

        }
    }
}
