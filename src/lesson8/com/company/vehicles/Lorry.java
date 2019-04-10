package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;
    public Lorry(String label, String classCar, int carrying, Engine engine, Driver driver){
        super(label,classCar,engine,driver);
        this.carrying = carrying;
    }
}

