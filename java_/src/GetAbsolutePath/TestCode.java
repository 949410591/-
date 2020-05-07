package GetAbsolutePath;

public class TestCode {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("TestReflect/Test.properties").getPath();
        System.out.println(path);
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("TestReflect/break.PNG").getPath());
    }
}
