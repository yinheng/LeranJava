package cap7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Learning
 */
public class TestTransform2 {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            while((s = br.readLine()) != null) {
                if(s.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println(s.toUpperCase());
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
