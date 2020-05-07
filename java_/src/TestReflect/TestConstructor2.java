package TestReflect;

import java.lang.reflect.*;
import java.util.Arrays;

public class TestConstructor2 {
    public static void main(String[] args) {
        Class studentClass = Student.class;

        try {
            Object o1 = studentClass.newInstance();

            Constructor constructor1 = studentClass.getDeclaredConstructor();
            Object o2 = constructor1.newInstance();
            Constructor constructor2 = studentClass.getDeclaredConstructor(int.class);
            Object o3 = constructor2.newInstance(1);


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
