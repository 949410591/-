import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestVector {
    public static void main(String[] args) {
        List l = new ArrayList();//非线程安全
        Collections.synchronizedList(l);//线程安全

    }
}
