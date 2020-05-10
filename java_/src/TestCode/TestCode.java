package TestCode;

import java.lang.reflect.Constructor;

public class TestCode{
    static {
        System.out.println("类加载1");
    }
    static {
        System.out.println("类加载2");
    }
    {
        System.out.println("实例语句块1");
    }
    {
        System.out.println("实例语句块2");
    }

    public TestCode() {
        System.out.println("无参构造方法");
    }
    public TestCode(Object a){
        System.out.println("有参构造");
    }

    class B{}
    static class C{}

    public static void main(String[] args){
        class D{}
        System.out.println("main method begin");
        A a = new A();
        System.out.println(a.a+a.b+a.c);
        TestCode b = new TestCode();
        TestCode c = new TestCode(new C() {


        });

    }
    {
        System.out.println("实例语句块3");
    }
    static {
        System.out.println("类加载3");
    }
}

interface C{}
class A{
    int a;
    int b;
    int c;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A() {
        this(1,2,3);
    }
}

class B extends A implements E{
    int d;
    int a;

    public B() {
    }

    public B(int a, int b, int c, int d, int a1) {
        super(a, b, c);
        this.d = d;
        this.a = a1;
    }
}

abstract class D{
    public abstract void a();
    public abstract void b();
    public abstract void c();


}

interface E extends H,I {}
interface H{}
interface I{}

