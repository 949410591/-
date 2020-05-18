public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println("a（）执行前");
            a();
            System.out.println("a（）执行后");

        }
        catch (Exception e){
            System.out.println("异常发生了");
            System.out.println(e);

        }
        finally {
            System.out.println("结束捕捉");

        }

        System.out.println("main方法结束");



    }
    public static void a() throws Exception{
        System.out.println("b() 执行前");
        b();
        System.out.println("b() 执行后");

    }
    public static void b() throws Exception{
        throw new ClassNotFoundException();

    }

}



