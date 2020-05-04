public class TestPriority {
    public static void main(String[] args) {

        //输出三个优先级常量
        System.out.println("最高优先级: " + Thread.MAX_PRIORITY);
        System.out.println("默认优先级: " + Thread.NORM_PRIORITY);
        System.out.println("最低优先级: " + Thread.MIN_PRIORITY);

        //显示当前线程优先级，设置线程优先级
        System.out.println("当前线程: " + Thread.currentThread().getName() + " 优先级: " + Thread.currentThread().getPriority());
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程: " + Thread.currentThread().getName() + " 优先级: " + Thread.currentThread().getPriority());


            }
        });
        t0.setPriority(1);
        t0.start();


        //设置优先级，运行监测结果
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);

                }

            }
        });
        t1.setPriority(10);
        Thread.currentThread().setPriority(1);
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);


        }
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("================================");
        //yield方法
        //让当前线程转回就绪状态，把cpu时间片让位给其它线程

        Thread.currentThread().setPriority(5);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //每次到i能被2整除的让位
                    if(i%10 == 0){
                        Thread.yield();
                    }

                    System.out.println(Thread.currentThread().getName() + ": " + i);

                }

            }
        });
        t2.start();

        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + ": " + i);

        }

        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //jion
        //合并线程

        System.out.println("==============================");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);

                }

            }
        });
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" over");



    }
}



