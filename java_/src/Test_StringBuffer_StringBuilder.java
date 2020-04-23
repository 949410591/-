public class Test_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();//16个byte数组,如果拼接过程中容量不够会自动扩容
        stringBuffer.append(123);
        stringBuffer.append(12312312);
        stringBuffer.append("fsadfasdfasfasdf");
        System.out.println(stringBuffer);


        StringBuilder sb = new StringBuilder();
        sb.append(123);
        sb.append("fasdfas");
        sb.append("sfasf");
        System.out.println(sb);
    }
}

