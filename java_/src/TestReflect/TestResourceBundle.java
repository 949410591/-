package TestReflect;

import java.util.ResourceBundle;

public class TestResourceBundle {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("TestReflect/Test");
        for(String key: bundle.keySet()){
            try {
                Class i  = Class.forName(bundle.getString(key));
                System.out.println(i.newInstance());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
