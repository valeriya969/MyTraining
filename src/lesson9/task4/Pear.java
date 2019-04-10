package lesson9.task4;

public class Pear extends Fruit {

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Pear{} " + super.toString();
    }


    final static double PEAR_PRICE=0.2;
    @Override
    public double price() {
        return getWeight()*PEAR_PRICE;
    }
}
