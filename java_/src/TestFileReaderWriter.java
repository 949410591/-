import javax.print.attribute.standard.PresentationDirection;
import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TestFileReaderWriter {
    public static void main(String[] args) {
        bulid("TestFileResderWriterFile");
        copy("TestFileResderWriterFile","Copy_TestFileResderWriterFile");
        System.out.println("复制结果:"+(testCopy("TestFileResderWriterFile","Copy_TestFileResderWriterFile")?"相同":"不相同"));


    }
    //以文件字节输入流来测试两个文件内容是否一致
    public static boolean testCopy(String filePath1, String filePath2){
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        try {
            fis1 = new FileInputStream(filePath1);
            fis2 = new FileInputStream(filePath2);
            byte[] bytes1 =new  byte[fis1.available()];
            byte[] bytes2 = new byte[fis2.available()];


            fis1.read(bytes1);
            fis2.read(bytes2);



            return new String(bytes1).equals(new String(bytes2));





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis1 != null){
                try {
                    fis1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis2 != null){
                try {
                    fis2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }
    //以文件字节输出流创建测试文本文件
    public static void bulid(String path){
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            fw.write("fjasdklfjlaskdjfkl;asdjf oiqwefjowij1341902482k3j4h1k25 874kjhr129847kjdhakJHD1   893719874");//直接写入字符串
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("测试文件内容："+ "fjasdklfjlaskdjfkl;asdjf oiqwefjowij1341902482k3j4h1k25 874kjhr129847kjdhakJHD1   893719874");

    }
    //以文件字符流复制测试文本文件
    public static void copy(String sourcePath, String targetPath){
        FileWriter output = null;
        FileReader input = null;
        try {
            output = new FileWriter(targetPath);
            input = new FileReader(sourcePath);

            char[] chars = new char[10];
            int charCount = 0;
            while ((charCount = input.read(chars)) != -1){
                output.write(chars,0,charCount);
            }

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
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("复制成功");

    }
}
