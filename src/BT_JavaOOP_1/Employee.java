package BT_JavaOOP_1;

public class Employee {
    String name;
    int age;
    String phone;
    String gender;
    String address ;

    public Employee(String name, int age, String phone,String gender, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}
