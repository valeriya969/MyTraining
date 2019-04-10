package lesson9.task4;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString();
    }

    final static double APPLE_PRICE = 0.1;

    @Override
    public double price() {
        return getWeight()*APPLE_PRICE;
    }
}