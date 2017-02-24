package cap7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Learning
 */
public class TestFileInputStream {

    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\nick\\java_code\\People.java");
        }catch (FileNotFoundException e) {
            System.out.println("系统找不到文件");
            System.exit(-1);

        }
        int num = 0;
        try {
            while((b = in.read() ) != -1) {
                System.out.print((char)b);
                num ++;
            }
            System.out.println("共读取"+ num + "个字节");
            in.close();
        }catch(IOException i) {
            System.out.println("文件读取错误");
            System.exit(-1);

        }
    }
}
