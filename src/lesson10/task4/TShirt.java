package lesson10.task4;

public class TShirt extends Clothes implements Ladieswear, Menswear {
    public TShirt(String size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressWoman() {
        System.out.println(this);

    }

    @Override
    public void dressMan() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
