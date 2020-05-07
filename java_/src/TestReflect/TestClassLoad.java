package TestReflect;

public class TestClassLoad {
    public static void main(String[] args) {
        try {
            Class a = Class.forName("TestReflect.Test");
            Object b = a.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
