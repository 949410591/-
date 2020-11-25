package TestGenericClass;

import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestGenericClass {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//        Animal bird = new Bird();
//        List l = new ArrayList();
//        l.add(cat);
//        l.add(bird);
//        for (int i = 0; i <l.size() ; i++) {
//            Object obj = l.get(i);
//            if(obj instanceof Animal){
//                ((Animal) obj).move();
//                if(obj instanceof Cat) ((Cat) obj).catchMouse();
//                else if(obj instanceof Bird)((Bird)obj).fly();
//            }
//        以上是以前的写法，使用泛型后是这样的



        Animal cat = new Cat();
        Animal bird = new Bird();
        List<Animal> l = new ArrayList<Animal>();
        //表示List集合中只允许存储Animal类型
        l.add(cat);
        l.add(bird);
        Iterator<Animal> it = l.iterator();
        //表示迭代器迭代的是Animal类型
        while (it.hasNext()){
            Animal animal = it.next();
            animal.move();//这里可以直接使用move方法了
            if(animal instanceof Cat) ((Cat)animal).catchMouse();
            else if(animal instanceof Bird)((Bird)animal).fly();



        }



    }
}






class Animal{
    public void move(){
        System.out.println("动物移动");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟飞翔");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
