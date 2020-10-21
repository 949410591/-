package TestInstanceof;

import java.util.Calendar;

public class Testinstanceof {
    public static void main(String[] args) {
        People c1 = new Chinese();
        People a1 = new American();
        c1.say_Something();
        a1.say_Something();
        /*
        * 编译阶段静态绑定的是People的Say_Something
        * 运行阶段动态绑定的是Chinese的Say_Something
        * 这个是向上转型
        */

        if(c1 instanceof Chinese){
            ((Chinese) c1).gongfu();
            /*如果遇到只有子类的特定方法需要向下转型使用子类的方法
            * 这个是向下转型*/
        }
        if(a1 instanceof Chinese){
            ((Chinese) a1).gongfu();
            /*这个是避免向下转型的风险，如果不用instanceof来判断a1的类型，
            * 直接使用((chinese) a1).gongfu();
            * 会造成编译错误
            * 为了避免这个错误，所以使用instanceof来判断a1是否是Chinese类*/
        }



    }
}


class People{
    private String name;
    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }



    public void say_Something(){
        System.out.println("I can say something" );
    }


}

class Chinese extends People {
    @Override
    public void say_Something() {
        System.out.println("I'm Chinese");
    }
    public void gongfu(){
        System.out.println("gongfu");
    }
}

class American extends People {

    @Override
    public void say_Something() {
        System.out.println("I'm American");
    }
}

