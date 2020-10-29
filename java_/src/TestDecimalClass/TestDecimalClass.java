package TestDecimalClass;

import java.text.DecimalFormat;

public class TestDecimalClass {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println(df.format(11111123123.123));


    }
}
