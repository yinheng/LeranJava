package cap6;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * Learning
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new LinkedList();
        c.add(new Name("f1","l1"));
        c.add(new Name("f2","l2"));
        c.add(new Name("f333","l33"));
        c.add(new Name("f4","l4"));

        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            Name name = (Name) iterator.next();
            System.out.println(name);
            if(name.getFirstName().length() > 2 ) {
                iterator.remove();
            }
        }
        System.out.println(c);
        c.iterator().forEachRemaining(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });


    }
}
