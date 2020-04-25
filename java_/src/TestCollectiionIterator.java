import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestCollectiionIterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("123");
        c.add(123);
        c.add(new Object());
        c.add(true);
        Iterator it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("123".length());





    }
}
