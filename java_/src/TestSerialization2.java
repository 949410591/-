import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TestSerialization2 {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("TestSerializationFile"));
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("TestSerializationFile"));
            //创建集合存储需要序列化的对象
            //集合是sun公司提供的，已经提前实现了Serializable
            List<TestClass03> l1 = new ArrayList<>();
            TestClass03 t1 = new TestClass03(1,"zhangshan");
            TestClass03 t2 = new TestClass03(2,"wangwu");
            TestClass03 t3 = new TestClass03(3,"lisi");
            l1.add(t1);
            l1.add(t2);
            l1.add(t3);

            //序列化对象集合
            objectOutputStream.writeObject(l1);

            //反序列化对象集合
            Object obj = objectInputStream.readObject();
            List<TestClass03> l2 = (List)obj;

            System.out.println("序列化和反序列化的集合是否一致(信息一致)："+l1.equals(l2));

            System.out.println("尝试使用transient");
            //TestClass04中num属性已经被transient修饰，不会参加序列化过程
            List<TestClass04> l3 = new ArrayList<>();

            TestClass04 t4 = new TestClass04(1,"zhangshan");
            TestClass04 t5 = new TestClass04(2,"wangwu");
            TestClass04 t6 = new TestClass04(3,"lisi");

            l3.add(t4);
            l3.add(t5);
            l3.add(t6);

            objectOutputStream = new ObjectOutputStream(new FileOutputStream("TestSerializationFile"));
            objectInputStream = new ObjectInputStream(new FileInputStream("TestSerializationFile"));

            objectOutputStream.writeObject(l3);
            obj = objectInputStream.readObject();
            System.out.println("序列化前的对象：");
            for(TestClass04 i:l3){
                System.out.println(i);
            }

            System.out.println("反序列化后的对象");
            List<TestClass04>  l4 = (ArrayList) obj;
            for(TestClass04 i:l4){
                System.out.println(i);
            }








            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(objectOutputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

class TestClass03 implements Serializable{
    int num;
    String name;

    @Override
    public String toString() {
        return "TestClass03{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass03 that = (TestClass03) o;
        return num == that.num &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    public TestClass03(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public TestClass03() {
    }
}


class TestClass04 implements Serializable{
    transient int num;
    String name;
    private static final long serialVersionUID = 949410591L;//这个数字自己随意写

    @Override
    public String toString() {
        return "TestClass03{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass03 that = (TestClass03) o;
        return num == that.num &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    public TestClass04(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public TestClass04() {
    }
}

