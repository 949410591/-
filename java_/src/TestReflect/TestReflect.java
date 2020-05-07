package TestReflect;

public class TestReflect {

    public static void main(String[] args) {
        Class stringClass = String.class;
        Class stringSuperClass = stringClass.getSuperclass();
        System.out.println(stringSuperClass.getSimpleName());

        for(Class in :stringClass.getInterfaces()){
            System.out.println(in);


        }

    }
}
