package lesson8.com.company.professions;

public class Person extends Driver {
    private int age;
public Person(String firstName, String lastName, int drivingExperience, int age){
    super(firstName, lastName, drivingExperience);
    this.age = age;
}

}
