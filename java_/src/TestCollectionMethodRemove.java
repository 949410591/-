import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethodRemove {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new String("123"));
        c.remove(new String("123"));
        System.out.println(c.size());
    }
}
