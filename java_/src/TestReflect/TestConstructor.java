package TestReflect;

import java.lang.reflect.*;

public class TestConstructor {
    public static void main(String[] args) {
        Class studentClass = Student.class;
        try {
            Object student = studentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Method[] studentMothods = studentClass.getDeclaredMethods();

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


        for(Constructor constructor : studentClass.getDeclaredConstructors()){
            result.append("\t"+Modifier.toString(constructor.getModifiers())+" "+constructor.getName());
            result.append("(");
            for(Parameter parameter:constructor.getParameters()){
                result.append(parameter.getType().getSimpleName()+" "+parameter.getName() +",");
            }
            if(constructor.getParameterCount()>0){
                result.deleteCharAt(result.length()-1);
            }
            result.append(")");
            result.append("{}");


            result.append("\n");
        }

        for(Method method: methods){
            result.append("\t"+Modifier.toString(method.getModifiers())+" "+method.getName());
            result.append("(");
            for(Parameter parameter:method.getParameters()){
                result.append(parameter.getType().getSimpleName()+" "+parameter.getName() +",");
            }
            if(method.getParameters().length != 0){
                result.deleteCharAt(result.length()-1);

            }
            result.append(")");
            result.append("{}");


            result.append("\n");
        }
        result.append("}");





        System.out.println(result);


    }
}
