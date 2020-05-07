package TestModifiableArgsLength;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1,2);

        m2();
        m2("123","ASDF");
        m3(123,12312312,123123,123123,123,123123,123123);




    }

    public static void m1(int... args){

    }

    public static void m2(String... args){
        for(String i : args){
            System.out.println(i);
        }
    }

    public static void m3(int a,int... b){
        System.out.println(a);
        System.out.println(Arrays.toString(b));
    }
}
