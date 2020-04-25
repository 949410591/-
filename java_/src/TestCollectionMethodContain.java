import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethodContain {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("123");

        String s2 = new String("123");

        c.add(s1);
        System.out.println(c.contains(s2));

    }
}
