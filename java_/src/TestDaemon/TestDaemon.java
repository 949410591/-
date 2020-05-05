package TestDaemon;

public class TestDaemon {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();

        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+
                    ":" +
                    i);

        }

    }


}


class MyThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            System.out.println(Thread.currentThread().getName()+
                    ":" +
                    ++i);
        }



    }
}
