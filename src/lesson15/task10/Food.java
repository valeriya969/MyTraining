package lesson15.task10;

import lesson14.task5.Cookable;

import java.util.function.Supplier;

public class Food {
    public void prepare(Cookable c){
        c.cook();
    }

    public static void main(String[] args) {
        Cookable food=()-> System.out.println("Let's cook cookies");
        food.cook();
//        Food food = new Food();
//        food.prepare(new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("Let's cook cookies");
//            }
//        });
    }
}
