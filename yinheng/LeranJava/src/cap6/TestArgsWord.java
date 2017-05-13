package cap6;

import java.util.HashMap;
import java.util.Map;

/**
 * Learning "aaaa cccc dddd aaaa ddddd cccc"
 */
public class TestArgsWord {

    private final static int one = 1;

    public static void main(String[] args) {
        getCharTimes(new String[]{"aaa", "bbb", "ccc", "aaa"});
    }

    static void getCharTimes(String[] strings) {
        Map m = new HashMap();
        for(String i: strings) {
            String key = i;
            Integer value = (Integer) m.get(key);
            m.put(key,value == null? one:  (value +1));
        }
        System.out.println(m);
    }
}
