public class TestThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadClass());
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程支线程输出："+i);


        }

    }
}

class ThreadClass implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程输出："+i);


        }
    }
}
