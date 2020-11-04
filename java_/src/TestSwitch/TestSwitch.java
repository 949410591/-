package TestSwitch;

import static TestSwitch.Size.Big;

public class TestSwitch {
    public static void main(String[] args) {
        //一般语法
        int n = new Integer(1);
        switch(n){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(n);
        }
        //可以是String
        String s = "1";
        switch(s){
            case "0":
                System.out.println(0);
                break;
            case "1":
                System.out.println(1);
                break;
            default:
                System.out.println(n);
        }
        //可以是Enum
        Size size = Size.Big;
        switch(size){
            case Big:
                System.out.println("big");
                break;
            case Small:
                System.out.println("small");
                break;
            default:
                System.out.println("equal");
        }

        size = Size.Small;
        //case穿透
        //没有break语句会从满足条件的case语句开始全部执行
        switch(size){
            case Big:
                System.out.println("big");
            case Small:
                System.out.println("small");
            default:
                System.out.println("equal");
        }

        //case合并
        //多个情况执行同样的语句
        switch(size){
            case Big: case Small:
                System.out.println("big");

                System.out.println("small");
                break;
            default:
                System.out.println("equal");
        }



    }
}
enum Size{
    Big,
    Small,
    Equal}

