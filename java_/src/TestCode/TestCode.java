package TestCode;

import TestFeatureTask.Testcode;

import java.util.Scanner;

public class TestCode {
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static  boolean g;
    static char h;


    public static void main(String[] args) {
        System.out.println(TestCode.a);
        System.out.println(TestCode.b);
        System.out.println(TestCode.c);
        System.out.println(TestCode.d);
        System.out.println(TestCode.f);
        System.out.println(TestCode.g);
        System.out.println(TestCode.h);



        a = 10;
        b =2;
        System.out.println(a+2);
        System.out.println(a-2);
        System.out.println(a/2);
        System.out.println(a%2);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println(a>>1);

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a == b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        System.out.println();
        boolean t;
        boolean f;

        for (int i = 0; i <3 ; i++) {

            switch(i){
                case 0:
                    t = true;
                    f = true;
                    break;
                case 1:
                    t = true;
                    f = false;
                    break;
                case 2:
                    t = false;
                    f = true;
                    break;

                default:
                    t = false;
                    f = false;




            }
            System.out.println("t:" +
                    t+
                    " f:" +
                    f);
            System.out.println("t&f--->"+(t&f));
            System.out.println("t&&f--->"+(t&f));

            System.out.println("t|f--->"+(t|f));
            System.out.println("t||f--->"+(t||f));
            System.out.println();




        }

        System.out.println("a:" +
                a+
                " b:" +
                b);
        System.out.println(a+=b);
        System.out.println("a:" +
                a+
                " b:" +
                b);
        System.out.println(a-=b);
        System.out.println("a:" +
                a+
                " b:" +
                b);
        System.out.println(a*=b);
        System.out.println("a:" +
                a+
                " b:" +
                b);
        System.out.println(a/=b);
        System.out.println("a:" +
                a+
                " b:" +
                b);
        System.out.println(a%=b);
        System.out.println("a:" +
                a+
                " b:" +
                b);



        if(a==b){
            System.out.println("true1");

        }
        else if(a >= b){
            System.out.println("true2");

        }
        else if (a <=b ){
            System.out.println("true3");

        }

        else{
            System.out.println("false");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());







    }
}



