package TestDeathLock;



public class TestDeathLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();


        MyThread t1 = new MyThread(o1,o2);
        MyThread t2 = new MyThread(o2,o1);
        t1.start();
        t2.start();


    }
}

class MyThread extends Thread{
    Object o1;
    Object o2;

    public MyThread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            System.out.println(Thread.currentThread().getName() + " 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + " 2");


            }
        }
    }
}


