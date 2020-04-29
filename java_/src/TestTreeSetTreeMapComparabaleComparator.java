import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetTreeMapComparabaleComparator {
    public static void main(String[] args) {

        //测试第一种写法
        Set<Wugui> s1 = new TreeSet<>();
        Random rd = new Random();
        for (int i = 0; i <10 ; i++) {
            s1.add(new Wugui(rd.nextInt(1000)));

        }
        System.out.println(s1);

        //测试第二种写法
        Set<Wugui2> s2 = new TreeSet<>(new WuguiComparator());
        for (int i = 0; i <10 ; i++) {
            s2.add(new Wugui2(rd.nextInt(1000)));

        }
        System.out.println(s2);

        //第二种方法还可以使用匿名内部类的方式实现

        Set<Wugui2> s3 = new TreeSet<>(new Comparator<Wugui2>() {
            @Override
            public int compare(Wugui2 o1, Wugui2 o2) {
                return o1.age -o2.age;
            }
        });

        for (int i = 0; i <10 ; i++) {
            s3.add(new Wugui2(rd.nextInt(1000)));

        }
        System.out.println(s3);



    }
}


//第一种自定义类实现比较类
class Wugui implements Comparable<Wugui>{
    int age;

    public Wugui(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Wugui o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Wugui{" +
                "age=" + age +
                '}';
    }
}

//第二种方法自定义比较器
class Wugui2{
    int age;

    public Wugui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wugui2{" +
                "age=" + age +
                '}';
    }

}

class WuguiComparator implements Comparator<Wugui2> {

    @Override
    public int compare(Wugui2 o1, Wugui2 o2) {
        return o1.age-o2.age;
    }
}


