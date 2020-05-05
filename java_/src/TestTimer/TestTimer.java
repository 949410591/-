package TestTimer;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");



        Date date = simpleDateFormat.parse("2020-05-05 15-15-15 000");
        Date firstTime = new Date();
        Timer timer = new Timer();
        timer.schedule(new MyTask(),firstTime,1000*10);


    }




}

class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println(new Date()+
                "数据备份");
    }
}


