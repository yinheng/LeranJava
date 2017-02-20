package cap6;

import java.util.HashMap;
import java.util.Map;

/**
 * Learning
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        Map m2 = new HashMap();
        m1.put("one", new Integer(1));
        m1.put("two", new Integer(2));
        m1.put("three", new Integer(3));
        m1.put("four", 4);
        m2.put("A", new Integer(1));
        m2.put("B", new Integer(2));
        m2.put("C",3);

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m1.containsValue(new Integer(2)));
        if(m1.containsKey("two")) {
            System.out.println(((Integer)m1.get("two")).intValue());
            System.out.println(m1.get("four"));
            System.out.println((Integer) m1.get("two"));
        }
        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);

    }
}
