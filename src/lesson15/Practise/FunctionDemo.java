package lesson15.Practise;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> i > 0 ? "Positive number" : i < 0 ? "Negative number" : "zero";
        System.out.println(function.apply(10));
        System.out.println(function.apply(-5));
        System.out.println(function.apply(0));

    }
}
