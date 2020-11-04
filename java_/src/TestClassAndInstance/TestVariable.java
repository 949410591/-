package TestClassAndInstance;

public class TestVariable{
    public static void main(String[] args) {

    }
}

class A{
    //直接赋值，或者使用本类的静态方法
    private int a = 1;
    private int b = setB(2);

    //使用构造方法定义
    private int c;

    public A(int c){
        this.c  = c;
    }

    private int setB(int i) {
        return i;
    }
}

class B{
    //没有定义构造方法，实例化对象后，系统提供的无参数构造方法会定义默认值
    private int b;

}
