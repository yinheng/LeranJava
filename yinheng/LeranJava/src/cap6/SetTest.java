package cap6;

import java.util.HashSet;
import java.util.Set;

/**
 * Learning
 */
public class SetTest {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");

        s2.add("a");
        s2.add("b");
        s2.add("3");
        System.out.println(s1);
        System.out.println(s2);

        Set sn = new HashSet(s1);
        Set su = new HashSet(s1);
        sn.retainAll(s2);
        su.addAll(s2);

        System.out.println(sn);
        System.out.println(su);
    }
}
