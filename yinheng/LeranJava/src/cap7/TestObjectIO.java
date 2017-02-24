package cap7;

import cap3.Point;

import java.io.*;

/**
 * Created @2017/2/24 20:59
 */
public class TestObjectIO {

    static final String PATH = "D:\\nick\\java_code\\object.stream";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream os = new ObjectOutputStream(fos);

        T t = new T();
        t.a = 10000;
        os.writeObject(t);

        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tt = (T)ois.readObject();
        System.out.println(tt);

        System.out.println();
        testExter();
    }

    public static void testExter() throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream os = new ObjectOutputStream(fos);

        TE t = new TE();
        t.a = 10000;
        os.writeObject(t);

        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        TE tte = (TE)ois.readObject();
        System.out.println(tte);
    }
}

class T implements Serializable {

    int a = 11;
    String s = "12";

    float f = 222f;

    @Override
    public String toString() {
        return "T{" +
                "a=" + a +
                ", s='" + s + '\'' +
                ", f=" + f +
                '}';
    }


}

class TE implements Externalizable {

    int a = 11;
    String s = "12";

    float f = 222f;

    public TE() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(a);
        out.writeUTF(s);
        out.writeFloat(f);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        a = in.readInt();
        s = in.readUTF();
        f = in.readFloat();
    }

    @Override
    public String toString() {
        return "TE{" +
                "a=" + a +
                ", s='" + s + '\'' +
                ", f=" + f +
                '}';
    }
}
