package lesson9.task4;

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple1 = new Apple(300);
        Apple apple2 = new Apple(300);
        Apricot apricot1 = new Apricot(200);
        Apricot apricot2 = new Apricot(400);
        Pear pear1 = new Pear(500);
        Pear pear2 = new Pear(700);
        Fruit[] fruits = {apple1, apple2, apricot1, apricot2, pear1, pear2};
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (Fruit fruit:fruits) {
            sum=sum+fruit.price();
            if(fruit.getClass().equals(Apple.class)){
                sum1 = sum1 + fruit.price();
            }
            else if (fruit.getClass().equals(Apricot.class)){
                sum2 = sum2 + fruit.price();
            }
            else if (fruit.getClass().equals(Pear.class)){
                sum3 = sum3 + fruit.price();
            }
        }
        System.out.println("Fruits were sold for the amount of " + sum);
        System.out.println("Apples were sold for the amount of " + sum1);
        System.out.println("Apricots were sold for the amount of " + sum2);
        System.out.println("Pears was sold for the amount of " + sum3);
        apple1.printManufacturerInfo();
    }
}
