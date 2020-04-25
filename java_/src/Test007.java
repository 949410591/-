public class Test007 {
    static {
        System.out.println("A");
    }
    public static void main(String[] args){

        new Test007();
        System.out.println("Z");

    }


    public  Test007(){
        System.out.println("B");

    }

    {//实例语句块

        System.out.println("C");

    }
    static {
        System.out.println("x");
    }
}

