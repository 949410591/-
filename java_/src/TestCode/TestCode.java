package TestCode;


import java.beans.PropertyChangeSupport;
import java.io.*;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.zip.CheckedOutputStream;

public class TestCode{

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {


        ResourceBundle resourceBundle = ResourceBundle.getBundle("TestCode/Test");
        for(String key:resourceBundle.keySet()){
            StringBuffer result  = new StringBuffer();

            Class a = Class.forName((String)resourceBundle.getString(key));
            result.append(Modifier.toString(a.getModifiers())+" "
                    +a.getSimpleName());
            result.append("{\n");


            Field[] fields = a.getDeclaredFields();
            for(Field field : fields){
                result.append("\t"+
                        Modifier.toString(field.getModifiers())+
                        " "+
                        field.getType().getSimpleName()+
                        " "+
                        field.getName()+
                        "\n");


            }

            Constructor[] constructors = a.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                result.append("\t"+
                        Modifier.toString(constructor.getModifiers())+
                        " "+
                        constructor.getName().substring(constructor.getName().lastIndexOf(".")+1) +
                        "("
                );
                Parameter[] parameters = constructor.getParameters();
                for(Parameter parameter: parameters){
                    result.append(Modifier.toString(parameter.getModifiers())+
                            " "+
                            parameter.getType().getSimpleName()+
                            " "+
                            parameter.getName()+
                            " "

                    );
                }
                result.append("){}\n");

            }


            Method[] methods = a.getDeclaredMethods();

            for(Method method : methods){
                result.append("\t"+
                        Modifier.toString(method.getModifiers())+
                        " "+
                        method.getReturnType().getSimpleName()+
                        " "+
                        method.getName()+
                        "("
                );
                for(Parameter parameter:method.getParameters()){
                    result.append(
                            Modifier.toString(parameter.getModifiers())+
                            " "+
                            parameter.getType().getSimpleName()+
                            " "+
                            parameter.getName());
                }
                result.append("){");
                result.append("}\n");
            }






            result.append("\n}");
            System.out.println(result);

            Class c1 = Class.forName("TestCode.A");
            Object a1 = c1.newInstance();

            Field a1a = c1.getDeclaredField("a");
            Field a1b = c1.getDeclaredField("b");
            Field a1c = c1.getDeclaredField("c");


            System.out.println(a1a.get(a1));
            System.out.println(a1b.get(a1));
            System.out.println(a1c.get(a1));


            a1a.set(a1,10);
            a1b.set(a1,20);
            a1c.set(a1,"30");

            System.out.println(a1a.get(a1));
            System.out.println(a1b.get(a1));
            System.out.println(a1c.get(a1));


            for(Method method:c1.getDeclaredMethods()){
                int pnum = method.getParameterCount();
                if(pnum != 1){
                    method.invoke(a1);
                }
                else{
                    Object rt = method.invoke(a1,1);
                    System.out.println(rt);
                }
            }


            Method methoda1 = c1.getDeclaredMethod("a");
            methoda1.invoke(a1);

            Method methoda2 = c1.getDeclaredMethod("a",int.class);
            Object rt = methoda2.invoke(a1,1);
            System.out.println(rt);




            Constructor c = c1.getDeclaredConstructor();
            Object o =  c.newInstance();
            System.out.println(o);

            Constructor cc = c1.getDeclaredConstructor(int.class);
            o = cc.newInstance(12);
            System.out.println(o);





            Class StringClass = String.class;
            System.out.println(StringClass);
            Class StringSuperClass = StringClass.getSuperclass();
            System.out.println(StringSuperClass);
            for(Class intf : StringClass.getInterfaces()){
                System.out.println(intf);
            }









        }
    }
}



class A{
    int a = 1;
    double b = 2;
    String c = "3";

    public A() {
    }

    public A(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public A(int a) {
        this.a = a;
    }

    public void a(){
        System.out.println("a 无参");
    }
    public int a(int a){
        System.out.println("a 有参数 int a");
        return 123;

    }
}


