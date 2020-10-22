package TestPower1;

public class A {
    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {

    }
}
class B{
    public void b(){
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        /*私有只能本类访问
        System.out.println(a.d);
        */
    }
}
