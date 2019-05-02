package lesson16.task4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashSetNumber {
    public static void main(String[] args) {
        System.out.println("Введите целые числа");
        sortedNumbers();
    }

    private static void sortedNumbers() {
        Set<String> integers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            integers.add(matcher.group());
        }
        System.out.println(integers);
    }
}