package TestCode;

import jdk.swing.interop.SwingInterOpUtils;

public class Student {
    public int age;
    protected int id;
    String name;
    private boolean sex;
    static {
        System.out.println("Student class load");
    }

    public Student() {
        System.out.println("无参构造");
    }
}
