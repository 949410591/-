import jdk.swing.interop.SwingInterOpUtils;

import javax.management.RuntimeOperationsException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CopyAllFile {
    public static void main(String[] args) {
        String sourcePath = "E:\\下载\\play";
        String margetPath = "E:\\下载\\play2";
        copyAllFile(sourcePath,margetPath);
        //copyAllFile(margetPath,sourcePath);

        //删除所有文件
        //rdAllFile(margetPath);



    }
    //删除所有文件
    public static void rdAllFile(String sourcePath){
        File sourceFile = new File(sourcePath);

        if(sourceFile.isDirectory()){
            //获取所有的子文件
            for(File file:sourceFile.listFiles()){
                //是文件就复制
                if(file.isFile()){
                    file.delete();
                }
                //是目录就调用findAllFile继续查找
                else if(file.isDirectory()){
                    rdAllFile(file.getAbsolutePath());
                }
            }
            sourceFile.delete();

        }


    }







    //显示每个文件复制时间
    public static void log(String sourcePath, String margetPath){
        long begin = System.currentTimeMillis();

        copy(sourcePath,margetPath);

        long end = System.currentTimeMillis();

        System.out.println(sourcePath+"-->"+margetPath+" 所花时间： "+(end - begin)+ "ms");


    }

    //复制所有文件
    public static void copyAllFile(String sourcePath,String margetPath){


        File margetFile = new File(margetPath);
        if(!margetFile.exists()){

            margetFile.mkdir();

        }
        findAllFile(sourcePath,margetPath);






    }

    //copy 文件
    public static void  copy(String sourcePath,String margetPath){

        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(sourcePath);
            output = new FileOutputStream(margetPath);
            byte[] bytes = new byte[input.available()];
            output.write(bytes);
            output.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
            System.out.println("复制成功，文件大小是否一致："+(new File(sourcePath).length() == new File((margetPath)).length()));

        }

    }
    //查找所有文件
    public static void  findAllFile(String sourcePath,String margetPath){
        File sourceFile = new File(sourcePath);

        if(sourceFile.isDirectory()){
            //获取所有的子文件
            for(File file:sourceFile.listFiles()){
                //是文件就复制
                if(file.isFile()){


                    log(file.getAbsolutePath(),margetPath+"\\"+file.getName());
                }
                //是目录就调用findAllFile继续查找
                else if(file.isDirectory()){
                    margetPath = margetPath+"\\"+file.getName();
                    File midFile = new File(margetPath);
                    if(!midFile.exists()){
                        midFile.mkdir();
                    }
                    findAllFile(file.getAbsolutePath(),margetPath);
                }
            }
        }

    }


}


