package cap7;

import cap3.Point;

import java.io.*;

/**
 * Created @2017/2/24 19:53
 */
public class TestPrintStream2 {

    public static Point spoint = new Point();


    public static void main(String[] args) {
        String path = "D:\\nick\\java_code\\People.java";

        PrintStream ps = System.err;

        try {
            list(path, ps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void list(String filePath, PrintStream ps) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = br.readLine()) != null) {
            ps.println(line);
        }

        br.close();
        ps.close();


        TestPrintStream2.spoint.setY(6);
    }

}
