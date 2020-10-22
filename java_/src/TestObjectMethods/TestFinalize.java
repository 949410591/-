package TestObjectMethods;

public class TestFinalize {
    public static void main(String[] args) {
        AA a = new AA();
        while(true){
            a = new AA();
        }
    }

}

class AA{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("正在销毁"+this.toString());
        super.finalize();
    }
}
