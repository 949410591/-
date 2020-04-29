import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.getSecurityManager;

public class TestPrintStream {
    public static void main(String[] args) {
        //清空log文件内容
        logClear();
        //调用方法，方法调用log方法写入log文件调用时间
        method1();
        method2();

    }
    public static void logClear(){
        PrintStream printStream = null;

        try {
            printStream = new PrintStream(new FileOutputStream("log"));
            System.setOut(printStream);
            System.out.print("");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    //测试的方法1
    public static void method1(){
        log("method1 begin");
        for (int i = 0; i <100 ; i++) {

        }
        log("method1 end");
    }
    //测试的方法2
    public static void method2(){
        log("method2 begin");
        for (long i = 0; i <10000000000L; i++) {

        }
        log("method2 end");
    }

    //写入日志
    public static void log(String message){
        long currentTime = System.currentTimeMillis();

        Date date  = new Date(currentTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = simpleDateFormat.format(date);
        PrintStream printStream = null;

        try {
            printStream = new PrintStream(new FileOutputStream("log",true));
            System.setOut(printStream);


            System.out.println(time + " 发生:" + message);
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
            System.out.println(time + " 发生:" + message);









        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        }


}


