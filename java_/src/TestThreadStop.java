public class TestThreadStop {
    public static void main(String[] args) {
        TestClass t = new TestClass();

        Thread t1 = new Thread(t);

        t1.start();
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        t.flag = false;

    }


}
class TestClass implements Runnable{
    boolean flag = true;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+"begin");

        for (int i = 0; i <1000 ; i++) {
            if(flag){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" "+"end");

                return;
            }

        }

    }
}


