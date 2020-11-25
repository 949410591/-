package TestGenericClass;

public class TestGeneric <E>{//这里的E只是标识符而已，可以随意写
    public static void main(String[] args) {
        //TestGeneric<Integer> integer = new TestGeneric<>();
        //integer.dosome(123);

    }
    public void dosome(E e){//这里和上面类似，E是什么是靠new的时候<>填写什么类型决定的
        System.out.println(e);
    }
}
