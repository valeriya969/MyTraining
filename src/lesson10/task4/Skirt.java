package lesson10.task4;

public class Skirt extends Clothes implements Ladieswear {
    public Skirt(String size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressWoman() {
              System.out.println(this);


    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
