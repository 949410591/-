import java.util.Scanner;

public class TestThread {
    public static void main(String[] args) {
        TestClassThread a = new TestClassThread();
        System.out.println("没有运行start方法，直接执行run方法");
     

        a.run();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程支线程输出："+i);

        }
        System.out.println("========================");
        System.out.println("执行start方法开启分支线程");
        a.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程支线程输出："+i);


        }
    }
}
class TestClassThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程输出："+i);


        }

    }
}
