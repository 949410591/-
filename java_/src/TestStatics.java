public class TestStatics {
    public static void main(String[] args){
        Chinese c1 = new Chinese("123","lisi ");
        Chinese c2 = new Chinese("456","zhangsan");
        System.out.println(c1.id);
        System.out.println(c1.xinming);
        System.out.println("类名.访问静态变量："+Chinese.guoji);//你可以这样直接访问

        System.out.println("引用访问静态变量："+c1.guoji);//也可以引用.访问
        c1 = null;
        System.out.println("赋值为null："+c1.guoji);//也可以引用.访问,但实际上是类名.访问的
    }


}

class Chinese {

    String id;
    String xinming;//姓名数据实例级别的属性
    static String guoji = "zhonguo";//国籍属于类级别的特征

    //静态变量再类加载时初始化不需要new对象，直接就有默认值，存储在方法区
    public Chinese(String id, String xinming) {

        this.id = id;
        this.xinming = xinming;
    }
}


