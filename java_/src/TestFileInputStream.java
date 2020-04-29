import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args)  {
        FileInputStream fis1 = null ;
        FileInputStream fis2 = null;
        try {
            fis1 = new FileInputStream("C:\\Users\\hanhan\\Desktop\\1" );
            //fis2 = new FileInputStream("C:/Users/hanhan/Desktop/1" );

            /*
            fis1 文件内容：
                1231
             */
            int i = fis1.read();//读取到的字节本身
            System.out.println(i);//49  实际上是1
            i= fis1.read();
            System.out.println(i);//50  2
            i= fis1.read();
            System.out.println(i);//51  3
            i= fis1.read();
            System.out.println(i);//49  1
            i= fis1.read();
            System.out.println(i);//-1 表示没有字节可以读了




        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis1 != null){//避免空指针异常
                try {
                    fis1.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

    }
}
