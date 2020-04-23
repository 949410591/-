import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Test_date {
    public static void main(String[] args) throws Exception {

        String dateString = "2008-8-8 8:8:8 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        Date date = sdf2.parse(dateString);//这里要在上面忽略异常
        System.out.println(date);

    }

}