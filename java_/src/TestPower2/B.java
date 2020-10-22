package TestPower2;

import TestPower1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
       /*
        public任何地方都能使用
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);*/

    }



}

class C extends A {
    public void c(){

        System.out.println(this.a);
        System.out.println(this.b);
        /*
        protected可以在不同包的子类中访问
        私有还是不能访问
        System.out.println(this.c);
        System.out.println(this.d);*/
    }
}
