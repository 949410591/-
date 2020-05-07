package TestReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestField2 {
    public static void main(String[] args) {
        try {

            Class studentclass = Class.forName("TestReflect.Student");
            Object student = studentclass.newInstance();
            if(student instanceof Student){
                ((Student) student).name = "zhanshan";
            }
            Field studentNameField = studentclass.getDeclaredField("name");
            System.out.println(studentNameField.get(student));

            studentNameField.set(student,"lisi");
            System.out.println(studentNameField.get(student));

            Field studentAgeField = studentclass.getDeclaredField("age");
            studentAgeField.setAccessible(true);
            studentAgeField.set(student,123);
            System.out.println(studentAgeField.get(student));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
