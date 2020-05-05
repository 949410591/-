package TestStaticArgSafe;

public class StaticClass {
    static int a  = 20;


    public synchronized static void seta(int b){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a -=b;
        System.out.println(a);


    }
}
