package cap6;

import java.util.Collection;
import java.util.HashSet;

/**
 * Learning
 */
public class EnhansedFor {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));

        for(Object o: c) {
            System.out.println(o);
        }


        int[] arr = {1,2,3,4,5};
        for(int i: arr) {
            System.out.println(i);
        }

    }
}
