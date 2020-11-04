package Test;

public class Test {
    public static void main(String[] args) {
        var a = new A();


    }

}

class A{
    int a;
    {a = 1;
        System.out.println("1");}
    public A(){
        this(3);
        System.out.println("2");
        this.a = 2;
    };
    public A(int a){
        System.out.println(3);
        this.a = a;
    }

}





