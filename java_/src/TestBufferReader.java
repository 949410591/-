import java.io.*;

public class TestBufferReader {
    public static void main(String[] args) {
        //写入测试数据包含\n \r
        fileWrite("fasjdflsajd\nfasdfasdfasdf\rflkasdjflkasjdf","TestFile");
        //BufferReader的readline方法不读取换行符
        System.out.println("采用println方式输出");
        test1("TestFile");
        System.out.println("======================");
        System.out.println("采用print方式输出");
        test2("TestFile");





    }

    //字符流方式写入测试数据
    public static void fileWrite(String contents,String filePath){
        FileWriter output = null;
        try {
            output = new FileWriter(filePath);
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


    //尝试用BufferReader读取，尝试用pinrtln输出
    public static void test1(String filePath){
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filePath));
            String line = "";
            while((line= input.readLine() )!= null){
                System.out.println(line);

            }
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void test2(String filePath){
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filePath));
            String line;
            while((line= input.readLine() )!= null){
                System.out.print(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
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
