package TestReflect;

import com.sun.jdi.VMOutOfMemoryException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class TestMethod {
    public static void main(String[] args) {
        Class studentClass = Student.class;
        Object student = studentClass.getNestHost();
        Method [] studentMothods = studentClass.getDeclaredMethods();
        for(Method method:studentMothods){
            System.out.print(Modifier.toString(method.getModifiers())+" ");
            System.out.println(method.getName());
            System.out.println(method.getParameterCount());
            method.getParameterCount();
            for(Parameter parameter:method.getParameters()){
                System.out.println(parameter.getType().getSimpleName());
                System.out.println(parameter.getName());
            }
        }


        StringBuffer result = new StringBuffer();
        result.append(Modifier.toString(studentClass.getModifiers())+
                " " +
                "Class"+
                " "+
                studentClass.getSimpleName());
        result.append("(");

        result.append(")");
        result.append("{\n");

        for(Field field:studentClass.getDeclaredFields()){
            String modifiers = Modifier.toString(field.getModifiers());
            String fieldType = field.getType().getSimpleName();
            result.append("\t"+modifiers+" ");
            result.append(fieldType+" ");
            result.append(field.getName()+" ");
            if(modifiers.contains("static")){
                result.append("= ");
                try {
                    switch (fieldType){
                        case "double":
                            result.append(field.getDouble(studentClass.newInstance())) ;
                            break;
                        case "int":
                            result.append(field.getInt(studentClass.newInstance()));
                            break;
                        case "long":
                            result.append(field.getLong(studentClass.newInstance()));

                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
            result.append("\n");


        }
        Method [] methods = studentClass.getDeclaredMethods();

        for(Method method: methods){
            result.append("\t"+Modifier.toString(method.getModifiers())+" "+method.getName());
            result.append("(");
            for(Parameter parameter:method.getParameters()){
                result.append(parameter.getType().getSimpleName()+" "+parameter.getName() +",");
            }
            result = new StringBuffer(result.substring(0,result.length()-1));
            result.append(")");
            result.append("{}");


            result.append("\n");
        }
        result.append("}");





        System.out.println(result);



    }
}


