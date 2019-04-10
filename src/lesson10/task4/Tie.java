package lesson10.task4;

public class Tie extends Clothes implements Menswear {
    public Tie(String size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println(this);


    }

    @Override
    public String toString() {
        return "Tie{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
