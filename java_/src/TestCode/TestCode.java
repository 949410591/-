package TestCode;

import javax.xml.crypto.Data;

public class TestCode {
    public static void main(String[] args) {
        Num num = new Num();

        Thread t1 = new Doublex(num);
        Thread t2 = new Doublexaddone(num);
        t1.setName("偶数");
        t2.setName("奇数");
        t1.start();

        t2.start();









    }
}


class Num {
    int num = 1;
}

class Doublex extends Thread{
    Num num ;

    public Doublex(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num){
            while(true){
                if (num.num % 2 != 0) {

                    try {

                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+
                        ":" +
                        num.num);
                num.num++;

                num.notify();
            }


        }
    }
}


class Doublexaddone extends Thread{
    Num num ;

    public Doublexaddone(Num num) {
        this.num = num;
    }


    @Override
    public void run() {
        synchronized (num){

            while(true){
                if(num.num %2 ==0){
                    try {

                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+
                        ":" +
                        num.num );
                num.num ++;

                num.notify();

            }

        }
    }
}




