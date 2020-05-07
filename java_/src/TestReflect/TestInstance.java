package TestReflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TestInstance {
    public static void main(String[] args) {
        FileReader input = null;
        try {
           input  = new FileReader("C:\\read\\java_\\src\\TestReflect\\Test.properties");
            Properties classlist = new Properties();
            classlist.load(input);
            Enumeration classListKeys = classlist.keys();

            while(classListKeys.hasMoreElements()){
                Object element = classListKeys.nextElement();
                if(element instanceof String){
                    Class i = Class.forName(classlist.getProperty((String) element))  ;
                    System.out.println(i.newInstance());
                }
            }

            for(Object element : classlist.keySet()){
                if(element instanceof String){
                    Class i = Class.forName(classlist.getProperty((String) element))  ;
                    System.out.println(i.newInstance());
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
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

