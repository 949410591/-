import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollectionMethod {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(123);//自动装箱
        c.add(new Integer(123));
        //以上两行代码相同
        c.add(new Object());
        c.add(true);//自动装箱
        c.add(new Boolean(true));

        System.out.println(c.size());

        c.clear();
        System.out.println(c.size());
        c.add("123");
        c.add("word");
        System.out.println(c.contains("123"));
        c.add("1234");
        System.out.println(c.contains("12345"));

        System.out.println(c.size());
        c.remove("1234");
        System.out.println(c.size());

        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());


        c.add(123);
        c.add(23);
        c.add("123");
        c.add(new Object());
        System.out.println(c);
        Object[] objs = c.toArray();
        System.out.println(Arrays.toString(objs));







    }
}
