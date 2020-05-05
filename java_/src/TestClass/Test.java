package TestClass;

public class Test {
    public static void main(String[] args) {
        try {
            Class stringClass1 = Class.forName("java.lang.String");
            Class stringClass2 = new String().getClass();
            System.out.println(stringClass1 == stringClass2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
