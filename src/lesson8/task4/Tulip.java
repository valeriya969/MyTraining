package lesson8.task4;

public class Tulip extends Flower {
    private String color;

    public Tulip(String manufacturer, int storageTime, double price, String color) {
        super(manufacturer, storageTime, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
