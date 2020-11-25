package TestInterface;

public class TestInterface {
    public static void main(String[] args) {
        D hanhan = new E();
        /*抽象类可以使用多态*/
        hanhan.a3();
        hanhan.a4();
        F pipi = new G();

        H.h();
    }
}


interface A{

}

interface B {

}

interface C extends A,B{}
/*接口可以多继承*/

interface D{
    public static final int a1 = 123;
    int a2 = 1;
    public abstract void a3();
    void a4();
    /*接口只有常量和抽象方法，
      接口中的常量public static final 可以省略
    * 接口中的方法public abstract可以省略*/
}

class E implements D,C {
/*
* 非抽象类使用关键字implements来是实现接口，可以实现多个接口，接口里的方法必须重写*/

    @Override
    public void a3() {
        System.out.println("a3");
    }

    @Override
    public void a4() {
        System.out.println("a4");
    }
}

abstract class F{


}
class G extends F{}


//接口可以有静态方法
interface H{
    public static String  h = "123";
    
    static void h(){
        System.out.println("这是H接口的静态方法"+h);
    }
}







