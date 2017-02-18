package cap6;

import cap3.Cat;

import java.util.*;


/**
 * Learning
 */
public class Conllection {

    int a;

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add(new A());
        c.add(new Name("hh","jj"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));

        System.out.println(c.toString());
        System.out.println(c.size());
        System.out.println(c.remove(new Name("hh", "jj")));

        A a = null;
        A a2 = new A();
        System.out.println(a);
        System.out.println(a2);
    }

    public static class A {
        @Override
        public String toString() {
            return "AAAAA";
        }
    }


}
