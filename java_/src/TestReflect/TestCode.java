package TestReflect;


public class TestCode {
    public static void main(String[] args) {

        try {
            Class stringClass1 = Class.forName("java.lang.String");
            Class stringClass2 = new String().getClass();
            Class stringClass3 = String.class;
            System.out.println(stringClass1 == stringClass2 );
            System.out.println(stringClass2 == stringClass3);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
