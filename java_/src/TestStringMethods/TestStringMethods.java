package TestStringMethods;

import java.util.Arrays;

public class TestStringMethods {
    public static void main(String[] args) {
        String s = new String("abc");


        System.out.println(s.charAt(0));
        //把String当数组去索引

        System.out.println("abc".compareTo("aab"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("acc"));
        //0相同，1前大，-1后小
        //两个字符串从第一个字符依次比较，比较出结果后面的字符串就不比较了

        System.out.println("abc".contains("g"));
        System.out.println("abc".contains("a"));
        //是否包含


        System.out.println("abc".endsWith("d"));
        System.out.println("abc".endsWith("c"));
        //是否已xx结尾

        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("123"));
        //是否相等

        System.out.println("abc".equalsIgnoreCase("abc"));
        System.out.println("abc".equalsIgnoreCase("ab"));
        //是否相等（忽略大小写）

        byte [] array1 = "abc".getBytes();
        System.out.println(Arrays.toString(array1));
        //把String变为byte数组

        System.out.println("abc".indexOf("c"));
        //目标的索引值

        System.out.println("abcbcbc".lastIndexOf("bc"));
        //最后一次出现的位置
    }
}
