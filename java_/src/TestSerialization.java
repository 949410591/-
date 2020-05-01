import java.io.*;
import java.util.Objects;


public class TestSerialization {




    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;


        //01没有实现Serializable
        //02有实现
        TestClass01 class01 = new TestClass01();
        TestClass02 class02 = new TestClass02(1,"李四");

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("TestSerializationFile"));
            objectInputStream = new ObjectInputStream(new FileInputStream("TestSerializationFile"));
            //objectOutputStream.writeObject(class01);
            //java.io.NotSerializableException: TestClass01

            //序列化
            System.out.println("序列化的对象: "+class02);
            objectOutputStream.writeObject(class02);
            //正常运行


            //反序列化
             Object obj = objectInputStream.readObject();
            System.out.println("反序列化的对象："+ obj);

            System.out.println("序列化前后序列化后的对象是否相等（数据相等）:"+class02.equals(obj));

            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
class TestClass01{}

class TestClass02 implements Serializable{
    int num ;
    String name ;

    @Override
    public String toString() {
        return "TestClass02{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    public TestClass02(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public TestClass02() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass02 class02 = (TestClass02) o;
        return num == class02.num &&
                Objects.equals(name, class02.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}





