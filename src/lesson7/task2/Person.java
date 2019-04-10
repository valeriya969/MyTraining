package lesson7.task2;

public class Person {
    String fullName;
    int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    Person(){}

    String talk(){
       return fullName;
    }
    void move(String name){

        System.out.println("Двигается "+ name);
    }
}


