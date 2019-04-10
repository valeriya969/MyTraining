package lesson10.task4;

public class Trousers extends Clothes implements Ladieswear, Menswear{
    public Trousers(String size, String color, double price) {
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
        return "Trousers{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
