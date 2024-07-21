package BT_JavaOOP_2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhone());
    }
}
