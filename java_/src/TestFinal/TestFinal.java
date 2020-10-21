package TestFinal;

public class TestFinal {
    public static void main(String[] args) {
        int a;
        a = 1;
        final int b = 1;
        final int c;
        c =3;
        /*
        b=2;
        final修饰的变量只能赋一次值

        */

        A a1 = new A();
        final A a2 = new A();
        final A a3 ;
        a3 = new A();
        /*
        a2 = new A();
        引用和变量一样只能赋一次值
        */


    }
}



final class  A{ }
/*class B extends A{}
* A类无法继承，所以这样会报错
* */


class C{
    public final void c1(){

    }

    public void c2(){}

}

class D extends C{
/*
    public final void c1(){}
    public void c1(){}
    final修饰的方法无法被覆盖
*/
    public final void c2(){

    }
    /*继承完以后可以重写把父类方法定义为final，继承D类的子类又无法重写了*/
}

class E{
    final int e1 = 0;
    /*
    * final 修饰的实例变量程序员必须手动赋值，不然会报错
    * */
    final int e2;

    E(){
        this.e2 = 1;
        /*只要我赶在系统赋默认值之前我就可以编译成功*/
    }


}

class F{
    public static final int A1 = 1;
    /*
    * 这个是定义常量，和静态变量一样
    * */
}



