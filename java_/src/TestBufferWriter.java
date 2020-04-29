import java.io.*;

public class TestBufferWriter {
    public static void main(String[] args) {
        test1("1231231231\r23,42134\r123423ksjdfhsk\rjfhaskjdf\n第一次写入\n","TestFile" );
        test2("1231231\n23123,\n42134123423ksjdfhs\nkjfhaskjdf\n第二次写入\r","TestFile" );
        read("TestFile");


    }
    //查看结果
    public static void read(String filePath){
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = input.readLine())!= null){
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
    //尝试output = new BufferedWriter(new FileWriter(filePath));
    public static void test1(String contents, String filePath){
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(filePath));
            output.write(contents);

            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //尝试使用转换流,且从文件结尾写入
    // output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath,true)));
    public static void test2(String contents, String filePath){
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath,true)));
            output.write(contents);

            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
