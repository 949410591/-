public class TestThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadClass());
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+
                    "输出:" +
                    i);


        }


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+
                            "输出:" +
                            i);


                }
            }
        });
        t2.setName("t2");
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+
                    "输出:" +
                    i);


        }


    }
}

//class ThreadClass implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("分支线程输出："+i);
//
//
//        }
//    }
//}

class ThreadClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+
                    "输出:" +
                    i);


        }
    }
}