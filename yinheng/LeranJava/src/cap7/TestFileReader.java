package cap7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Learning
 */
public class TestFileReader {
    public static void main(String[] args) {
        int c = 0;
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\nick\\java_code\\People.java");
            while((c= fr.read()) != -1) {
                c = fr.read();
            }
            fr.close();
        }

        catch(FileNotFoundException e) {
            System.out.println("系统找不到文件");
            System.exit(-1);

        }
        catch(IOException e1) {
            System.out.println("读取文件错误");
        }
    }
}
