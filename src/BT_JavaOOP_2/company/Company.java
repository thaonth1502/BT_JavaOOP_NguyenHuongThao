package BT_JavaOOP_2.company;
import BT_JavaOOP_2.person.Person;

public class Company {

    public static void main(String[] args) {
        Person person = new Person(
                "Nguyen Huong Thao",
                35,
                "Female",
                "Hanoi",
                "0345678903"
        );
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
    }

}
