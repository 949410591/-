import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("TestFile");
            /*
            文件内容：
                abcdef
             */
            byte[] readByte = new byte[2];
            int readCount = 0;
            while ((readCount = fis.read(readByte))!= -1){
                fis.skip(2);
                System.out.print(new String(readByte,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
