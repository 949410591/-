package TestEnum;

public class TestEnum {
    public static void main(String[] args) throws Exception {
        compare result =compareNum(1,2);
        System.out.println(result);
        result =compareNum(2,1);
        System.out.println(result);
        result =compareNum(1,1);
        System.out.println(result);



    }
    enum compare{
        big,small,equel
    }
    public static compare compareNum(int a, int b){
        if(a>b) return compare.big;
        else if(a<b) return compare.small;
        else return compare.equel;

    }
}
