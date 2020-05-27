import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("C:\\read\\java_\\src\\TestCode\\a.txt");
             int readReult = 0;
             while ((readReult = fis.read()) != -1){
                 System.out.println(readReult);
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
