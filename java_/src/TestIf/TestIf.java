package TestIf;

public class TestIf {
    public static void main(String[] args) {
        if(2>1) System.out.println("2>1");

        if(2<1){
            System.out.println("2<1");
        }
        else{
            System.out.println("2>1");
        }

        if(2<1){
            System.out.println("2>2");

        }
        else if (2==1){
            System.out.println("2>1");
        }
        else{
            System.out.println("2>1");
        }
    }
}
