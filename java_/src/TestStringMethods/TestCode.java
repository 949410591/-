package TestStringMethods;

import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        String s = new String("abc");
        System.out.println(s.charAt(1));

        System.out.println("abc".compareTo("aab"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("acc"));

        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("e"));

        System.out.println("abc".endsWith("e"));
        System.out.println("abc".endsWith("c"));

        System.out.println("abc".equals("bc"));
        System.out.println("abc".equals("abc"));

        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println("abc".equalsIgnoreCase("AB"));

        byte [] a = "abc".getBytes();
        System.out.println(Arrays.toString(a));

        System.out.println("abc".indexOf("c"));
        System.out.println("abcabcabc".lastIndexOf("bc"));



        System.out.println("abc".isEmpty());

        System.out.println("abc".length());

        System.out.println("abc".replace("bc","BC"));

        System.out.println(Arrays.toString("abc".split("b")));

        System.out.println("abc".startsWith("a"));

        System.out.println("abcdefg".substring(2));
        System.out.println("abcdefg".substring(2,4));

        System.out.println(Arrays.toString("abc".toCharArray()));

        System.out.println("aBcD".toUpperCase());
        System.out.println("aBcD".toLowerCase());


        System.out.println("   a  b  c   ".trim());

        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(12.3));
        System.out.println(String.valueOf(new Object()));



        StringBuffer b = new StringBuffer();
        b.append(1);
        b.append("123");
        System.out.println(b);






    }



}
