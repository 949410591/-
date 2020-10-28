package TestInteger;

public class Test_String_int_Integer {
    public static void main(String[] args) {
        Integer a1 = new Integer(1);
        //装箱
        int a2 = a1.intValue();
        //拆箱


        Integer i1 = 1;
        //自动装箱
        int i2 = i1;
        //自动装箱

        System.out.println(new Integer(123));
        System.out.println(new Integer("123"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.parseInt("1"));
        System.out.println(Integer.valueOf("1"));
        //包装类常用方法，其它包装类类似，可以直接看api文档





        // int --> string
        String a = String.valueOf(1);
        a = ""+1;
        // String --> int
        int b = Integer.parseInt("1");
        //int --> Integer
        Integer c = 1;
        //integer --> int
        int d = new Integer(1);
        d = Integer.valueOf(1);
        //Integer --> String
        String e = String.valueOf(1);
        //String --> Integer
        Integer f = Integer.valueOf("1");
    }
}
