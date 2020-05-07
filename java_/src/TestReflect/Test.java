package TestReflect;

public class Test {
    static {
        System.out.println("Test类加载");
    }
    {
        System.out.println("Test构造方法执行");
    }
    public Test() {
        System.out.println("Test"+
                "创建");
    }
}
