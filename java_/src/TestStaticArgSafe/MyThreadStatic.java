package TestStaticArgSafe;

public class MyThreadStatic extends Thread{
    @Override
    public void run() {
        StaticClass.seta(10);
    }
}
