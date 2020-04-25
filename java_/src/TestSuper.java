public class TestSuper {
    static int aaa;
    public static void main(String[] args) {


            B1 b = new B1();
            b.printa();
    }
}


class A1{
    int a1;

    public A1(){

    }
    public A1(int a1){
        this.a1 = a1;
    }
}


class B1 extends A1{
    private int a1;

    public B1(){
        super(1);

    }
    public void printa(){
        System.out.println(this.a1);//这个是子类型自己的a1特征
        System.out.println(super.a1);//这里访问的是继承的父类型特征a1
        System.out.println(a1);//这个实际上是this.a1，也是子类型自己的特征

    }

}