package TestCode;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestCode{
    public static void main(String[] args) throws ParseException {

        List l = new ArrayList();
        for (int i = 0; i <10; i++) {
            l.add(i);

        }
        System.out.println(l);

        for (int i = 0; i <l.size() ; i++) {

            System.out.println(l.get(i));
        }
        System.out.println();
        for(Object obj : l){
            System.out.println(obj);
        }
        System.out.println();
        Iterator iterator = l.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        l.add(11);
        System.out.println(l.get(2));
        System.out.println(l);
        System.out.println(l.indexOf(11));
        l.remove(new Integer(11));
        System.out.println(l);
        l.set(2,3);
        System.out.println(l);


        List l2 = new LinkedList();


        List l3 = new Vector();

        Collections.synchronizedList(l);


        Map m = new HashMap();
        for (int i = 0; i <10 ; i++) {
            m.put(i,i);
        }
        System.out.println(m);

        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue(2));
        System.out.println(m.get(4));
        System.out.println(m.keySet());
        System.out.println(m.remove(2));
        System.out.println(m);
        System.out.println(m.remove(1,1));

        System.out.println(m);

        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.values());
        System.out.println(m.entrySet());


        for(Object entry : m.entrySet()){
            if(entry instanceof Map.Entry){

                System.out.println( ((Map.Entry) entry).getValue());
                System.out.println(((Map.Entry) entry).getKey());


            }
        }

        System.out.println();
        for(Object key:m.keySet()){
            System.out.println(
                    key+
                    " "
                    +m.get(key));
        }



        m.clear();
        System.out.println(m);




        Set s = new HashSet();
        A a1 = new A(1);
        A a2 = new A(2);
        s.add(a1);
        s.add(a2);

        System.out.println(s.size());


        s = new TreeSet();
        s.add(a1);
        s.add(a2);
        System.out.println("TreeSet size:"+s.size());


        B b1 = new B(1);
        B b2 = new B(2);
        s = new TreeSet(new BComparator());
        s.add(b1);
        s.add(b2);
        System.out.println(s.size());
        System.out.println(s);


        s = new TreeSet(new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                return o1.num-o2.num;
            }
        });
        s.add(b1);
        s.add(b2);
        System.out.println(s.size());
        System.out.println(s);
























    }



}

class A  implements Comparable{
    int num;

    public A() {
    }

    public A(int num) {
        this.num = num;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof A){
            return this.num - ((A)o).num;
        }

        return 0;
    }
}


class B{
    int num;

    public B(int num) {
        this.num = num;
    }

    public B() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return num == b.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "B{" +
                "num=" + num +
                '}';
    }
}

class BComparator implements Comparator<B> {


    @Override
    public int compare(B o1, B o2) {

        return o2.num - o1.num;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}