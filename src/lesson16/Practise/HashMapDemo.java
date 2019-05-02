package lesson16.Practise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 45));
        map.put("Cube", new Toy("Cube", 50));
        map.put("Car", new Toy("Car", 40));
        printKeys(map);
        printValues(map);
        printEntries(map);
    }

    private static void printEntries(Map<String, Toy> map) {
        Set<Map.Entry<String,Toy>> entrySet=map.entrySet();
        for (Map.Entry<String, Toy> stringToyEntry : entrySet) {
            System.out.println(stringToyEntry.getKey());
            System.out.println(stringToyEntry.getValue());
        }
    }

    private static void printValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        System.out.println(values);
    }

    private static void printKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
