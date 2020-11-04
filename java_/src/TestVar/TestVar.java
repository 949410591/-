package TestVar;

public class TestVar {
    public static void main(String[] args) {
        method();

    }
    public static void method(){
        //自动识别后面的类型，无需指定类型
        //为了程序的可读性，一般方法内部的局部变量可以，字段和参数还是老实声明；
        var object  = new Object();
        var a = 1;
        var b = "2";

        System.out.println(object);
        System.out.println(a);
        System.out.println(b);
    }
}
