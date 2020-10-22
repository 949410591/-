package TestObjectMethods;

public class TestObjectMethods {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println("a.toString()="+a.toString());
        System.out.println("a="+a);
    }
}

class A{}
