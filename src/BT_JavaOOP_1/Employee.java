package BT_JavaOOP_1;

public class Employee {
    String name;
    int age;
    String phone;
    String address;

    public Employee(){

    }

    public Employee(String name, int age, String phone, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone: " + getPhone());
        System.out.println("Address: " + getAddress());
    }
}
