package BT_JavaOOP_2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person(
                "Nguyen Huong Thao",
                35,
                "Female",
                "Hanoi",
                "0345678903"
        );
       person.showInfo();
    }
}
