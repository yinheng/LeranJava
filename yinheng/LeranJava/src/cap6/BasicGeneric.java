package cap6;

import com.sun.xml.internal.ws.api.message.HeaderList;
import practise.android.Service;

import java.util.*;

/**
 * Learning
 */
public class BasicGeneric {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<String >();
        l1.add("aaa");
        l1.add("bbb");
        l1.add("ccc");
        for(int i = 0; i < l1.size(); i ++) {
            String s = l1.get(i);
            System.out.println(s);
        }
        Collection<String> c = new HashSet<String>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        for(Iterator<String> i = c.iterator(); i.hasNext();) {
           String ss = i.next();
           System.out.println(ss);

        }

        Getter<Service> getter = new ServiceGetter();
        ServiceGetter serviceGetter = new ServiceGetter();
        Service service =  getter.get();
    }

    interface Getter<T> {
        T get();
    }

    static class ServiceGetter implements Getter<Service> {

        @Override
        public Service get() {
            return null;
        }
    }
}


