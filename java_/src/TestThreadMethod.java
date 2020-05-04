public class TestThreadMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread1());
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        dosome();



        //测试中断睡眠
        Thread t3 = new Thread(new Thread2());
        t3.setName("t3");
        t3.start();
        Thread.currentThread().setName("main");
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        t3.interrupt();







    }
    public static void dosome(){
        System.out.println("当前线程："+Thread.currentThread().getName());

    }
}


class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName());

    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" begin");


        try {
            Thread.sleep(1000*60*60*24*12*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName()+" end");

    }
}
