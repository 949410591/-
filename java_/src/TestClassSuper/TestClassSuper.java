package TestClassSuper;

public class TestClassSuper {
    public static void main(String[] args) {
        B1 b = new B1();
        b.printa();

        var c = new C1();
        c.printa();
    }
}
class A1{
    private int a1;

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public A1(){

    }
    public A1(int a1){
        this.a1 = a1;
    }
}


class B1 extends A1 {
    private int a1;
    public B1() {
        super(1);

    }

//    @Override
//    public int getA1() {
//        return a1;
//    }
//
//    @Override
//    public void setA1(int a1) {
//        this.a1 = a1;
//    }

    public void printa() {
        System.out.println("this.a1="+this.a1);//这个是子类型自己的a1特征
        System.out.println("a1="+a1);//这个实际上是this.a1，也是子类型自己的特征
        System.out.println("super.getA1()="+super.getA1());//这里访问的是继承的父类型特征a1
        System.out.println("this.getA1()"+this.getA1());
        /*
        * 如果子类重写了this.getA1和this.setA1调用的是子类的方法
        * 如果没有写this.getA1和this.setA1是调用父类的方法
        * 这个细节需要注意
        * */

    }
}
class C1 extends A1 {
    private int a1;
    public C1() {
        super(1);

    }

    @Override
    public int getA1() {
        return  super.getA1();
        // returnf getA1(); 会造成
    }
    public void printa(){
        System.out.println(super.getA1());
        System.out.println(getA1());
    }
}


class D1 extends A1 {
    //当子类和夫类有相同的字段时
    //继承的父类熟悉和子类定义的属性
    //使用各自的封装方法调用
    private int a1;
    public D1() {
        super(1);
        this.a1 = 2;
    }

    @Override
    public int getA1() {
        return  this.a1;
        // returnf getA1(); 会造成
    }
    public void printa(){
        System.out.println(super.getA1());
        System.out.println(getA1());
    }
}
