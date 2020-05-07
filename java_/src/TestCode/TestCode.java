package TestCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

public class TestCode {
    private Object student;

    public static void main(String[] args) {
        FileReader reader = null;
        InputStream inputStream = null;
        try {
            Class c1 = Class.forName("java.lang.String");
            Class c2 = new String().getClass();
            Class c3 = String.class;





            System.out.println(c1 == c2);
            System.out.println(c2 == c3);



            Class studentClass1 = new Student().getClass();
            Class studentClass2 = Student.class;
            Class studentClass3 = Class.forName("TestCode.Student");

            System.out.println(studentClass1 == studentClass2);
            System.out.println(studentClass2 == studentClass3);


            Object student = studentClass1.newInstance();


            String path =  Thread.currentThread().getContextClassLoader().getResource("TestCode/Test.properties").getPath();
            reader  =  new FileReader(path);
            Properties properties = new Properties();
            properties.load(reader);


            for(Object key : properties.keySet()){
                Class c = Class.forName(properties.getProperty((String)key));
                System.out.println(c);


            }

            for(Map.Entry<Object, Object> entry : properties.entrySet()){
                Class c = Class.forName((String)entry.getValue());

                System.out.println(c);

            }


            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("TestCode/Test.properties");
            properties.load(inputStream);


            for(Object key : properties.keySet()){
                Class c = Class.forName(properties.getProperty((String)key));
                System.out.println(c);


            }

            for(Map.Entry<Object, Object> entry : properties.entrySet()){
                Class c = Class.forName((String)entry.getValue());

                System.out.println(c);

            }



            ResourceBundle resourceBundle = ResourceBundle.getBundle("TestCode/Test");
            for(String key:resourceBundle.keySet()){
                Class c = Class.forName(resourceBundle.getString(key));
                System.out.println(c);
            }


            Class studentClass = Student.class;



            Field[] studentFields = studentClass.getFields();
            for(Field field : studentFields){
                System.out.println(field);
            }


            studentFields = studentClass.getDeclaredFields();
            for(Field field : studentFields){
                System.out.print(Modifier.toString(field.getModifiers())+" " );
                System.out.print(field.getType().getSimpleName()+ " ");
                System.out.println(field.getName());

            }



            student = (Object)student;
            student = new Student();

            Field studentNameField = studentClass.getDeclaredField("name");
            Field studentSexField = studentClass.getDeclaredField("sex");
            studentSexField.setAccessible(true);
            System.out.println(studentSexField.get(student));

            studentSexField.set(student,true);
            System.out.println(studentSexField.get(student));





















        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}


