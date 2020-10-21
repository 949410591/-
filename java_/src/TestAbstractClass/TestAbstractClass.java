package TestAbstractClass;

public class TestAbstractClass {
}

abstract class A{
    public abstract void a1();
    public abstract void a2();

}
/*final abstract class A1{}
* 抽象类无法使用final是矛盾的，语法也不允许*/
class B extends A{
    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }
    /*
    * 继承了抽象类必须实现抽象类的方法
    * 有多少实现多少*/
}

abstract class C{
    public C() {

    }
    public C(String c1){

    }

}

class D extends C{
    public D(){
        super();
    }
    public D(String c1){
        super(c1);
    }
    /*抽象方法的构造方法是供子类使用的*/
}
