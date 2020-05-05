import javax.swing.*;

public class TestThreadMethod {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new Thread1());
//        Thread t2 = new Thread(new Thread1());
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t2.start();
//        dosome();
//
//
//
//        //测试中断睡眠
//        Thread t3 = new Thread(new Thread2());
//        t3.setName("t3");
//        t3.start();
//        Thread.currentThread().setName("main");
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(Thread.currentThread().getName()+"--->"+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//        t3.interrupt();
//
//
//        Thread t4 =  new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000*10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println(Thread.currentThread().getName()+
//                        "我醒了"+
//                        "优先级是：" +
//                        Thread.currentThread().getPriority());
//            }
//
//
//        });
//        t4.start();
//        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+
//                    "i:" +
//                    i);
//
//
//        }
//
//        t4.interrupt();
//
//        System.out.println("最大优先级:" +
//                Thread.MIN_PRIORITY+
//                " 最小优先级：" +
//                Thread.MIN_PRIORITY+
//                " 默认优先级：" +
//                Thread.NORM_PRIORITY);
//
//
//




        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+
                            "输出：" +
                            i);

                }
            }
        });
        t5.start();

        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i <100 ; i++) {

            System.out.println(Thread.currentThread().getName()+
                    "输出：" +
                    i);
        }


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
