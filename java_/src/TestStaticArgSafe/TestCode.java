package TestStaticArgSafe;

import TestStaticArgSafe.MyThreadStatic;

public class TestCode {
    public static void main(String[] args) {


        Thread t3 = new MyThreadStatic();
        Thread t4 = new MyThreadStatic();
        t3.start();
        t4.start();



    }
}




