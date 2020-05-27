package TestReflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestField {
    public static void main(String[] args) {
        try {
            Class test  = Class.forName("TestReflect.Student");
            Field[] tf1 = test.getFields();//只获取public修饰的字段
            Field[] tf2 = test.getDeclaredFields();
            StringBuffer result = new StringBuffer("public class " + test.getName()+" {"+"\n");
            for(Field f : tf2){

                result.append("\t");
                result.append(Modifier.toString(f.getModifiers()).stripTrailing()+" ");
                result.append(f.getType().getSimpleName()+" ");
                result.append(f.getName());
                result.append(";\n");
            }
            result.append("}");

            System.out.println(result);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
