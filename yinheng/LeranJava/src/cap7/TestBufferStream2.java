package cap7;

import java.io.*;

/**
 * Learning
 */
public class TestBufferStream2 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\nick\\java_code\\People.java"));
            BufferedReader br = new BufferedReader(new FileReader("D:\\nick\\java_code\\People.java"));
            String s = null;
            for(int i = 0; i <= 100; i++) {
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();

            while((s= br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
