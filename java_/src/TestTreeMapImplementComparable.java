import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeMapImplementComparable {
    public static void main(String[] args) {
        Set<H> s = new TreeSet<>();
        Random rd = new Random();
        for (int i = 0; i <10 ; i++) {
            int num = rd.nextInt(100);
            System.out.println(num);
            s.add(new H(num));

        }
        System.out.println("++++++++++++++++");
        for (H h: s
             ) {
            System.out.println(h.age);

        }

    }

}

class H implements Comparable<H>{
    int age;

    public H() {
    }

    public H(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(H o) {
//        if (this.age == o.age) return 0;
//        else if (this.age > o.age) return 1;
//        else return -1;
        return o.age-this.age;
    }
}

