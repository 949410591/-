package TestReflect;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

public class TestInputStream {
    public static void main(String[] args) {
        InputStream  input = Thread.currentThread().getContextClassLoader().getResourceAsStream("TestReflect/Test.properties");

        Properties properties = new Properties();
        try {
            properties.load(input);

            for (Object key: properties.keySet()
            ) {
                Class i = Class.forName(properties.getProperty((String)key));
                System.out.println(i.newInstance());

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}


