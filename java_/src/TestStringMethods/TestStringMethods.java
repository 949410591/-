package TestStringMethods;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class TestStringMethods {
    public static void main(String[] args) {
        String s = new String("abc");


        System.out.println(s

                .charAt(0));
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

        System.out.println("abc".isEmpty());
        //判断是否是空

        System.out.println("abc".length());
        //输出字符串长度

        System.out.println("abc".replace("c","CC"));
        //代替

        System.out.println(Arrays.toString("abc".split("b")));
        //以xx元素来分割组

        System.out.println(Arrays.toString("abc".toCharArray()));
        //把字符串变为字符数组

        System.out.println("abc".toUpperCase());
        //全部大写

        System.out.println("abc".toLowerCase());
        //全部小写

        System.out.println("  abc abc abc  ".trim());
        //出去字符串前后的空格

        System.out.println(String.valueOf(new Object()));
        //把其它对象转化炜Sting类型



    }
}
