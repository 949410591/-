import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileOutputStream1 {
    public static void main(String[] args) {

        //创建一个新文件写入123456
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("TestOutputFile");
            byte[] bytes = "123456".getBytes();
            fos.write(bytes);
            System.out.println("写入内容："+ "123456");
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        //查看文件内容
        FileInputStream fls= null;
        try {
            fls = new FileInputStream("TestOutputFile");
            byte[] bytes = new byte[fls.available()];
            int readCount = fls.read(bytes);
            System.out.println("文件内容："+new String(bytes,0,readCount));
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
        }


        //在重写原来的文件,写入abcdef

        try {
            fos = new FileOutputStream("TestOutputFile");
            byte[] bytes = "abcdef".getBytes();
            fos.write(bytes);
            System.out.println("写入内容："+ "abcdef");
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        //查看文件内容

        try {
            fls = new FileInputStream("TestOutputFile");
            byte[] bytes = new byte[fls.available()];
            int readCount = fls.read(bytes);
            System.out.println("文件内容："+new String(bytes,0,readCount));
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
        }

        //在原来文件末尾追加hijklmn
        try {
            fos = new FileOutputStream("TestOutputFile",true);
            byte[] bytes = "hijklmn".getBytes();
            fos.write(bytes);
            System.out.println("写入追加内容："+ "hijklmn");
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        //查看文件内容

        try {
            fls = new FileInputStream("TestOutputFile");
            byte[] bytes = new byte[fls.available()];
            int readCount = fls.read(bytes);
            System.out.println("文件内容："+new String(bytes,0,readCount));
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
        }



    }


}
