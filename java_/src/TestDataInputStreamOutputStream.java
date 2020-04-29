import java.io.*;

public class TestDataInputStreamOutputStream {
    public static void main(String[] args) {
        output("TestFile");
        input("TestFile");
    }
    //写入数据
    public static void output(String filePath){
        DataOutputStream outputStream = null;
        try {

            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            byte a = 1;
            short b = 2;
            int c = 3;
            long d = 4;
            float e = 123.124124124F;
            double f = 1234.123123;
            boolean g = true;
            char h = 'f';

            outputStream.writeByte(a);
            outputStream.writeShort(b);
            outputStream.writeInt(c);
            outputStream.writeLong(d);
            outputStream.writeFloat(e);
            outputStream.writeDouble(f);
            outputStream.writeBoolean(g);
            outputStream.writeChar(h);


            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //读出数据
    public static void input(String filePath){
        DataInputStream input = null;
        try {
            input = new DataInputStream(new FileInputStream(filePath));
            System.out.println(input.readByte());
            System.out.println(input.readShort());
            System.out.println(input.readInt());
            System.out.println(input.readLong());
            System.out.println(input.readFloat());
            System.out.println(input.readDouble());
            System.out.println(input.readBoolean());
            System.out.println(input.readChar());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
