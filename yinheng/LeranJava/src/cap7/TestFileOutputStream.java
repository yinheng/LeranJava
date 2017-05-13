package cap7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Learning
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\nick\\java_code\\People.java");
            out = new FileOutputStream("D:\\nick\\java_code\\Out.java");
            while((b = in.read()) != -1) {
                out.write(b);

            }
            in.close();
            out.close();


        }catch(FileNotFoundException e) {
            System.out.println("找不到文件");
            System.exit(-1);

        }
        catch (IOException e1) {
            System.out.println("复制文件错误");
            System.exit(-1);

        }
        System.out.println("文件复制成功");
    }
}
