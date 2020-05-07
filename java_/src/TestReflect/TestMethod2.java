package TestReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Date;

public class TestMethod2 {
    public static void main(String[] args) {
        Class studentClass = Student.class;

        try {

            Object student = studentClass.newInstance();
            ((Student)student).sleep();
            ((Student)student).sleep(new Date(),new Date());
            Method argsMethod = studentClass.getMethod("sleep", Date.class, Date.class);
            Object result = argsMethod.invoke(student,new Date(),new Date());
            System.out.println(result);
            Method noArgsMethod = studentClass.getDeclaredMethod("sleep");
            result = noArgsMethod.invoke(student);
            System.out.println(result);


            System.out.println("");

            //自动调用所有方法
            /*
            获取所有形参类型
            实例化每个形参对应的类型
            放入实例数组中作为参数调用方法
             */

            for(Method method: studentClass.getDeclaredMethods()){
                Parameter[]  parameters= method.getParameters();
                Object[] instance = new Object[parameters.length];
                for (int i = 0; i <parameters.length ; i++) {
                    instance[i] = parameters[i].getType().newInstance();
                }

                method.invoke(student,instance);

            }

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
