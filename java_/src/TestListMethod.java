import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static java.lang.Integer.toBinaryString;

public class TestListMethod {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("A");
        l.add("B");

        l.add(1,"C");
        l.add("A");


        Iterator it = l.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));

        }

        System.out.println(l.indexOf("A"));

        System.out.println(l.lastIndexOf("A"));

        System.out.println(l);
        l.remove(l.lastIndexOf("A"));
        System.out.println(l);

        l.set(l.lastIndexOf("C"),"B");
        l.set(l.lastIndexOf("B"),"C");
        System.out.println(l);

        System.out.println(toBinaryString(10));










    }
}
