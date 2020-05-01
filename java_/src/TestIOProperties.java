import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestIOProperties {
    public static void main(String[] args) {
        FileReader input = null;
        try {
            input = new FileReader("TestIOPropertiesFile.properties");
            Properties p = new Properties();
            p.load(input);
            for(Object i: p.keySet()){
                if(i instanceof String){
                    String key = (String)i;
                    System.out.println(key+"="+p.getProperty(key));
                }



            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
