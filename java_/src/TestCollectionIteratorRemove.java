import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.CheckedOutputStream;

public class TestCollectionIteratorRemove {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            c.add(i);

        }
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            it.remove();
            System.out.println(c);
        }
    }
}
