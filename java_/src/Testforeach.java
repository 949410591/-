import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Testforeach {
    public static void main(String[] args) {
        int[] c = new int[10];
        for (int i = 0; i <10 ; i++) {
            c[i] = i;

        }

        for ( int i : c) {
            System.out.println(i);

        }

        List<Integer> c2 = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            c2.add(i);

        }

        //下标遍历
        for (int i = 0; i <c2.size() ; i++) {
            System.out.println(c2.get(i));

        }

        //使用迭代器遍历
        Iterator<Integer>  it=  c2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //使用foreach遍历
        for (Integer i:c2
             ) {
            System.out.println(i);

        }

    }
}
