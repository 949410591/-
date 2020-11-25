package TestAbstractClass;

import javax.xml.namespace.QName;

public class TestAbstract {
}

abstract class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract String getDescription();

}
