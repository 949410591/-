import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("F:\\read\\java_");
        System.out.println("f1存在结果: "+f1.exists());

        File f2 = new File("F:\\read\\java_\\TestFile");
        f2.delete();
        System.out.println("f2存在结果: "+f2.exists());


        if(!f2.exists()){
            try {
                f2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("f2存在结果: "+f2.exists());



        File f3 = new File("F:\\read\\java_\\Test");
        if(!f3.exists()){
            f3.mkdir();

        }
        System.out.println("f3存在结果："+f3.exists());

        f3.delete();
        System.out.println("f3存在结果："+f3.exists());

        System.out.println("f3的父路径:"+ f3.getParent());

        File f4 = f3.getParentFile();
        System.out.println("f3的父路径:"+ f4.getPath());

        System.out.println("f3的绝对路径： "+ f3.getAbsolutePath());

        System.out.println("f4的名字：" + f4.getName()+" f4是否是个目录:"+ f4.isDirectory());

        System.out.println("f3是否是个文件："+ f3.isFile());

        File f5 = new File("F:\\read\\java_/java.emmx");


        Date date = new Date(f5.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        String time = simpleDateFormat.format(date);
        System.out.println("f5最后修改时间："+ time+" f5的大小是： "+ f5.length()+" byte");

        File f6 = f5.getParentFile();
        System.out.println("f6是不是目录： "+ f6.isDirectory());
        System.out.println("f6下的内容：");
        for(File file:f6.listFiles()){
            System.out.println(file.getPath());
        }






    }
}
