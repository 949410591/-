import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethodContain2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Han h1 = new Han("123");
        Han h2 = new Han("123");

        c.add(h1);
        System.out.println(c.contains(h2));


    }
}

class Han{
    String name;

    public Han(String name) {
        this.name = name;
    }
}
