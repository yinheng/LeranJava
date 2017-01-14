package cap3;

/**
 * Created by guohao4 on 2017/1/14.
 */
public class Leaf {

    int i = 0;

    Leaf(int i) {
        this.i = i;
    }

    Leaf increament() {
        i++;
        return this;
    }

    public void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] arg) {
        Leaf leaf = new Leaf(100);
        leaf.increament().increament().increament().print();
    }
}
