package TestReflect;

import java.util.Date;

public class Student {
    public int id;
    protected String name;
    Boolean sex;
    private double age;
    public static final double p = 3.1415926;
    int[] a;


    public Student(int id, String name, Boolean sex, double age, int[] a) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.a = a;
    }

    public Student(int id, String name, Boolean sex, double age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, Boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public static void dosome(){
        System.out.println("dosome");
    }

    public void study(){

    }

    public void sleep(Date start, Date end){
        System.out.println("有参数");

    }
    void sleep(){
        System.out.println("没参数");

    }

}
