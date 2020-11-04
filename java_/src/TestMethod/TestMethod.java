package TestMethod;

public class TestMethod {
    public static void main(String[] args) {
        int a = 1;
        method1();
        method1(a);
        System.out.println(method2(0));

    }

    public static void method1(){
        System.out.println("method1");

    }
    //方法重载，相同方法名，不同参数类型
    public static void method1(int a){
        System.out.println(a);
    }
    //方法递归,方法自己调用自己
    public static int method2(int a){
        if(a == 10){
            return a;
        }
        return method2(a+1);

    }
}
