package lesson8.task4;

public class Pion extends Flower {
    private String color;

    public Pion(String manufacturer, int storageTime, double price, String color) {
        super(manufacturer, storageTime, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
