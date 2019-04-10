package lesson8.com.company.professions;

public class Driver {
    private String firstName,lastName;
    private int drivingExperience;

    public Driver(String firstName, String lastName, int drivingExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.drivingExperience = drivingExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
