package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        System.out.println(d.getTime());
        //获取从1970年到现在的毫秒数

        SimpleDateFormat sfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //日期格式可以直接看文档
        System.out.println(sfm.format(d.getTime()));
        //这个是Date实例对象->String

        String fake_Date_String = "2007-7-7 7:7:7";
        Date date = sfm.parse(fake_Date_String);
        //把String->Date实例对象
        System.out.println(date);


        System.out.println(System.currentTimeMillis());
        //获取从1970年到现在的毫秒数


        long beginTime = System.currentTimeMillis();
        int n = 1;
        for (int i = 0; i < 1000000; i++) {
            n++;


        }
        long endTime  = System.currentTimeMillis();
        //和Date一样也是从1970 1 1 开始算起 但是它的返回值是long类型的

        System.out.println(endTime - beginTime+" ms");
        //计算n自加1000000

        Date currentTime  = new Date(endTime);
        //Date 支持用ms来创建Date对象




    }
}
