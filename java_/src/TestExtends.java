public class TestExtends{
    public static void main(String[] args){
						/*
						Chinese c = new Chinese("韩寒");
						American a = new American("jeak");
						以上的错误原因是因为，我在下面Chinese和American类是
						继承People类，但是没有继承构造方法。
						我也没有写构造方法，所以不能使用有参数的构造方法
						*/

        Chinese1 c = new Chinese1();
        American a = new American();
        c.setName("瀚瀚");
        a.setName("jack");
        c.speak();
        a.speak();
						/*
							这里直接使用系统默认给的无参数构造方法
							使用setName方法赋值name属性，所以是可以的。
						*/

    }
}
class People{
    private String name;
    public People(){}
    public People(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void speak(){
        System.out.println(name + "....");
    }

}

class Chinese1 extends People{
    public void speak(){//父类方法复制粘贴！！！！！！！！！！！！
        System.out.println(this.getName()+ " 说中国话");
        //这里是方法覆盖，把speak方法重写
    }
}


class American extends People{
    public void speak(){//父类方法复制粘贴！！！！！！！！！！！！
        System.out.println(this.getName()+ " speak english");
        //这里是方法覆盖，把speak方法重写
    }
}