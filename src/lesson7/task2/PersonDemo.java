package lesson7.task2;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Sue", 23);
        Person person2 = new Person();
        System.out.println("Звонит "+person1.talk());
        person2.move("Shelli");
    }
}
