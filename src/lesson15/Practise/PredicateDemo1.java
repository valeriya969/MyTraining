package lesson15.Practise;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = (s) -> s.startsWith("J");
        Predicate<String> predicate2 = (s) -> s.startsWith("N");
        Predicate<String> predicate3 = (s) -> s.endsWith("A");
        System.out.println(predicate1.or(predicate2).and(predicate3).test("JaNA"));
        System.out.println(predicate1.or(predicate2).and(predicate3).test("NaNA"));
        System.out.println(predicate1.or(predicate2).and(predicate3).test("NaN"));

    }
}
