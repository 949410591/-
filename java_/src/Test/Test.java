package Test;

public class Test {
    public static void main(String[] args) {
        System.out.println(        compareSize(1,10));
        System.out.println(        compareSize(10,1));
        System.out.println(        compareSize(1,1));


    }
    public static Size compareSize(int a, int b){

        if(a>b)return Size.big;
        else if(a==b)return Size.equel;
        else return Size.small;
    }
}

enum Size{
    big,small,equel
}





