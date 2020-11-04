package TestBlock;

public class TestBlock {
    public static void main(String[] args) {
        int n = 1;
        {
//            int n = 1; 会出现编译错误，内层语句块定义相同的变量会覆盖外部定义的变量，java是不允许这样的
            n = 2;
            System.out.println(n+1);//实例语句块
            //

        }
        System.out.println(n+2);
    }
}
