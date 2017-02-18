package cap6;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Learning
 */
public class ListTest {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        for(int i = 0; i <= 5; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        l1.add(2, "a100");
        System.out.println(l1);

        l1.set(1, "a200");
        System.out.println(l1);

        System.out.println(l1.get(2));

        l1.remove(4);
        System.out.println(l1);

        System.out.println(l1.indexOf("a5"));

        Collections.shuffle(l1);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);

        Collections.reverse(l1);
        System.out.println(l1);

        // FIXME 必须升序排列 才能返回正确值
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1, "a5"));
    }
}
