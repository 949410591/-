import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {
    public static void main(String[] args) {
        FileInputStream fls = null;
        FileOutputStream fos = null;
        try {
            fls = new FileInputStream("super()内存图.png");
            fos = new FileOutputStream("Copy_super()内存图.png");
            byte[] bytes = new byte[fls.available()];
            fls.read(bytes);
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fls != null){
                try {
                    fls.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
