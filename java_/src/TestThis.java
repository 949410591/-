public class TestThis {
    public static void main(String[] args) {

            A a = new A(1,2,3);
            System.out.println(a.get_a());

            a.set_a(100);
            System.out.println(a.get_a());

        }
    }

class A{
    private int a;
    private int b;
    private int c;
    public A(){};
    public A(int a, int b, int c){
        this.a = a;
        //如果不写this,jvm会自动人为下面的a、b、c是形式参数这里的abc
        //因为jvm是就近原则的
        this.b = b;
        this.c = c;
    }
    public void set_a(int a){
        this.a = a;//同样的道理
    }
    public int get_a(){
        return this.a;
    }
}


