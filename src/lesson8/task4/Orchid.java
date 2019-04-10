package lesson8.task4;

public class Orchid extends Flower {
    private String color;
    private String sort;

    public Orchid(String manufacturer, int storageTime, double price, String color, String sort) {
        super(manufacturer, storageTime, price);
        this.color = color;
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public String getSort() {
        return sort;
    }
}
