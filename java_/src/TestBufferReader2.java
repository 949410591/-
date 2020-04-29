import java.io.*;

public class TestBufferReader2 {
    public static void main(String[] args) {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new InputStreamReader(new FileInputStream("src/Test007.java")));
            String line ;
            while ((line = input.readLine()) != null){
                System.out.println(line);
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
