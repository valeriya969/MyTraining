package lessson16.Practise;


import java.util.function.Consumer;

public class HeavyBox extends Box6 implements Comparable<HeavyBox> {
    private int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(double w, double h, double d, int weight) {
        super(w, h, d);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                "} " ;
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight-o.weight;
    }

    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1=(box)-> System.out.println("Отгрузили ящик весом "+box.weight);
        Consumer<HeavyBox> consumer2=(box)-> System.out.println("Отправляем ящик весом "+box.weight);
        consumer1.andThen(consumer2).accept(new HeavyBox(20,30,40,100));
    }
}
