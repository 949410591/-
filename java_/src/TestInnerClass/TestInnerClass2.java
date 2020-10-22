package TestInnerClass;

public class TestInnerClass2 {
    public static void main(String[] args) {
        Math.mySum(new ComputeImp(),1,2);
        // 通常方法，创建类实现接口后new
        Math.mySum(new Compute() {
            @Override
            public void sum(int a, int b) {
                System.out.println(a+b);
            }
        },1,2);
        //匿名内部类，没有类的名字，直接new接口实现
    }
}

interface Compute{
    void sum(int a,int b);
}
class ComputeImp implements Compute{

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
}
class Math{
    public static void mySum(Compute c, int a, int b){
        c.sum(a,b);
    }
}
