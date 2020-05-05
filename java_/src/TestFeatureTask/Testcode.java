package TestFeatureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Testcode {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName()+
                        " begin");
                Thread.sleep(1000*10);
                System.out.println(Thread.currentThread().getName()+
                        " end");
                return 1+2;
            }
        });
        Thread t1 = new Thread(futureTask);

        t1.start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}




