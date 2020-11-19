package TestParameter;



public class TestParameter {
    public static void main(String[] args) {
        int a1 = 1;
        System.out.println(a1);
        A.a(a1);
        System.out.println(a1);
        //方法不改变基本数据类型的参数，这里不改变的是指main方法定义的a1
        System.out.println();


        B b = new B();
        System.out.println(b);
        B.changeB(b);
        System.out.println(b);
        //方法可以改变对象参数的状态（B类型对象的b字段）
        System.out.println();


        B b1 = new B();
        b1.setB(1);
        B b2 = new B();
        b2.setB(2);
        System.out.println(b1);
        System.out.println(b2);
        B.swapB(b1,b2);
        System.out.println(b1);
        System.out.println(b2);
        //方法不能让对象参数引用一个新的对象
    }
}


class A{
    public static void a(int a1){
        a1 = 123;

    }
}

class B{
    private int b;
    public B(){
        this.b = 123;
    }
    public void setB(int b){
        this.b = b;
    }

    public static void changeB(B b){
        b.setB(1);
    }


    public  static void swapB(B b1, B b2){
        var x = b1;
        b1 = b2;
        b2 = x;


    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                '}';
    }
}

