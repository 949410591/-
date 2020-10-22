package TestObjectMethods;

import java.io.ObjectInputStream;
import java.util.Objects;

public class TestOverrideObjectMethods {
    public static void main(String[] args) {
        Object u1 = new User("1",new Address("1","1","1"));
        Object u2 = new User("1",new Address("1","1","1"));
        Object u3 = new User("2",new Address("1","1","1"));
        Object u4 = new User("1",new Address("2","1","1"));

        System.out.println("u1==u2:"+u1.equals(u2));
        System.out.println("u1==u3:"+u1.equals(u3));
        System.out.println("u1==u4:"+u1.equals(u4));

    }
}


class User{
    String name;
    Address addr;
    public User(){}
    public User(String name, Address addr){
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof User)) return  false;
        if(this == obj) return true;
        if(this.addr.equals(((User) obj).addr) && this.name.equals(((User)obj).name))return true;
        return false;
    }

}

class Address{
    String city;
    String street;
    String zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipCode);
    }

    public Address(String city, String street, String zipCode) {

        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public Address() {
    }
}
