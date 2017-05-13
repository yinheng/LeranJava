package cap7;

import java.io.*;

/**
 * Learning
 */
public class TestDataStream {
    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeDouble(99);
            dos.writeBoolean(false);
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readBoolean());
        } catch(IOException e) {
            e.printStackTrace();

        }

        testFileStream();
    }

    public static void testFileStream() {
        try {
            FileOutputStream fos =  new FileOutputStream("D:\\nick\\java_code\\People.java");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(99);
            dos.writeBoolean(false);
            dos.writeBoolean(true);
            FileInputStream fis = new FileInputStream("D:\\nick\\java_code\\People.java");
            System.out.println(fis.available());
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readBoolean());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
