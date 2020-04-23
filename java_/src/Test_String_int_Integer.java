public class Test_String_int_Integer {
    public static void main(String[] args) {
        // int --> string
        String a = String.valueOf(1);
        a = ""+1;
        // String --> int
        int b = Integer.parseInt("1");
        //int --> Integer
        Integer c = 1;
        //integer --> int
        int d = new Integer(1);
        //Integer --> String
        String e = String.valueOf(1);
        //String --> Integer
        Integer f = Integer.valueOf("1");
    }
}
