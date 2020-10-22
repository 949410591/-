package TestObjectMethods;

import java.util.Objects;

public class TestObjectMethods {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("a.toString()="+a.toString());
        System.out.println("a="+a);
        /*打印引用，会调用该引用的toString方法*/

        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println("s1==s2:"+s1==s2);
        System.out.println("s1.equals(s2):"+s1.equals(s2));
        /*引用数据类型用equals方法来判断相等，基本数据类型用==来判断是否相等*/




    }
}

class A{
    /*每个类需要写无参构造、有参构造、属性设置获取，重写hashcode、重写toString、重写equals*/
    private int a;

    public A(int a) {
        this.a = a;
    }

    public A() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return a == a1.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }

}
