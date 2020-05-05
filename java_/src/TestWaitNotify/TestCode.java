package TestWaitNotify;

import java.util.ArrayList;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        List list = new ArrayList();
        Customor customor = new Customor(list);
        Processor processor = new Processor(list);
        customor.setName("customor");
        processor.setName("processor");
        customor.start();
        processor.start();

    }
}

class Processor extends Thread{
    List list;

    public Processor(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized(list){
            while (true){
                if(list.size()>=10){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                    Object obj = new Object();
                    list.add(obj);
                    System.out.println(Thread.currentThread().getName()+
                            "生产" +
                            obj+
                            " " +
                            list.size());
                    list.notify();



            }
        }




    }
}

class Customor extends Thread {
    List list;

    public Customor(java.util.List list)
    {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list){
            while (true){
                if(list.size()==0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                    System.out.println(Thread.currentThread().getName()+
                            " 消费" +
                            list.remove(0)+
                            " " +
                            list.size());
                    list.notify();


            }

        }


    }
}
