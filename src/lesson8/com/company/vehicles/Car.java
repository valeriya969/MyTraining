package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Car {
    private String label;
    private String classCar;
    private Engine engine;
    private Driver driver;

    public Car(String label, String classCar, Engine engine, Driver driver) {
        this.label = label;
        this.classCar = classCar;
        this.engine = engine;
        this.driver = driver;
    }

    public String getLabel() {
        return label;
    }

    public String getClassCar() {
        return classCar;
    }

    public  void  start(){
        System.out.println("Go!");
    }

    public void stop(){
        System.out.println("Stop!");
    }

    public void turnLeft(){
        System.out.println("Turn left!");
    }

    public void turnRight(){
        System.out.println("Turn right!");
    }

    public void printInfo(){
        System.out.println(driver.getFirstName()+" "+driver.getLastName()+" " +driver.getDrivingExperience()+" "
                +getLabel()+" "+getClassCar()+" "+engine.getPower()+" "+engine.getManufacturer());
    }

}
