package cap7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Learning
 */
public class TestTransform1 {
    public static void main(String[] args){
        try{
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\nick\\java_code\\People.java"));
            osw.write("yehehwkowmvckw");
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("D:\\nick\\java_code\\People.java", true), "ISO8859-1");
            osw.write("yioppppii");
            System.out.println(osw.getEncoding());
            osw.close();

        }catch(IOException e) {
            e.printStackTrace();

        }
    }
}
