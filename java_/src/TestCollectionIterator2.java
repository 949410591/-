import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionIterator2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator it1 = c.iterator();
        //这里获取的是没有添加元素的集合的迭代器
        System.out.println("没有元素集合的迭代器");
        while (it1.hasNext()){
            Object obj = it1.next();
            System.out.println(obj);
        }
        for (int i = 0; i <10 ; i++) {
            c.add(i);

        }
        Iterator it2 = c.iterator();
        System.out.println("添加元素的集合的迭代器");
        while (it2.hasNext()){
            Object obj = it2.next();
            System.out.println(obj);
        }
    }
}
