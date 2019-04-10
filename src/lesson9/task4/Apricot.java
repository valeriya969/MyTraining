package lesson9.task4;

public class Apricot extends Fruit {

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apricot{} " + super.toString();
    }

    final static double APRICOT_PRICE = 0.15;
    @Override
    public double price() {
        return getWeight() * APRICOT_PRICE;
    }
}
