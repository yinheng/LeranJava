package cap6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Learning
 */
public class CompareToTest {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        l1.add(new Name("keven", "f"));
        l1.add(new Name("wen", "m"));
        l1.add(new Name("nick", "d"));

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
    }
}
