package cap7;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Learning
 */
public class TestBufferStream1 {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("D:\\nick\\java_code\\People.java");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int b = 0;
            System.out.println(bis.read());
            System.out.println(bis.read());
            bis.mark(100);
            for(int i = 0; i <= 10 && (b= bis.read()) != -1; i ++) {
                System.out.print(b + " ");
            }
            System.out.println();
            bis.reset();
            for(int i = 0; i <= 10 && (b= bis.read()) != -1; i ++) {
                System.out.print(b + " ");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
