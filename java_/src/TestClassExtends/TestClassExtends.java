package TestClassExtends;

public class TestClassExtends {

  public static void main(String[] args) {
      /*
    People chinese  = new Chinese("李磊");
    People american  = new American("jeck");
    父类构造方法无法继承，子类又没有写含参数的构造方法
    所以无法使用
*/
      People chinese  = new Chinese();
      People american  = new American();
      chinese.say_Something();
      american.say_Something();
      chinese.setName("hanhan");
      american.setName("jeck");
      System.out.println(chinese.getName()+american.getName());
      //父类私有属性的继承不能直接访问，但可以通过方法间接访问


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

class Chinese extends People{
    @Override
    public void say_Something() {
        System.out.println("I'm Chinese");
    }
}

class American extends People{

    @Override
    public void say_Something() {
        System.out.println("I'm American");
    }
}

