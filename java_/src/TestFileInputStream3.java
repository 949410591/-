import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Set;

public class TestFileInputStream3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new  FileInputStream("TestFile");
            /*
            文件内容：
                abcdef

             */

            byte[] readByte = new byte[4];
            int readCount = fis.read(readByte);
            System.out.println(readCount);
            System.out.println(Arrays.toString(readByte));
            System.out.println(new String(readByte,0,readCount));
            /*
            4
            [97, 98, 99, 100]
            读取4个字节，值是[97, 98, 99, 100]
             */

            readCount = fis.read(readByte);
            System.out.println(readCount);
            System.out.println(Arrays.toString(readByte));
            System.out.println(new String(readByte,0,readCount));

            /*
            2
            [101, 102, 99, 100]
            读取2个字节，只覆盖数组中的前两个元素
             */


            readCount = fis.read(readByte);
            System.out.println(readCount);
            System.out.println(Arrays.toString(readByte));

            /*
            -1
            [101, 102, 99, 100]
            没有读取到数据，返回-1，数组不变
             */




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
