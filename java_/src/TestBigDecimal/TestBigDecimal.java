package TestBigDecimal;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(123);
        BigDecimal bd2 = new BigDecimal(123.123);

        BigDecimal bd3;
        bd3 = bd1.add(bd2);
        System.out.println(bd3);

    }
}
