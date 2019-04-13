package lesson15.Practise;

import java.util.function.Consumer;

public class HeavyBox extends Box6 {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1=(box)-> System.out.println("Отгрузили ящик весом "+box.weight);
        Consumer<HeavyBox> consumer2=(box)-> System.out.println("Отправляем ящик весом "+box.weight);
        consumer1.andThen(consumer2).accept(new HeavyBox(20,30,40,100));
    }
}
