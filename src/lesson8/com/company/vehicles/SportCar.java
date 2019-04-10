package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;
    SportCar(String label, String classCar, int carrying, Engine engine, Driver driver, double speed){
        super(label, classCar, engine, driver);
        this.speed=speed;
    }
}
