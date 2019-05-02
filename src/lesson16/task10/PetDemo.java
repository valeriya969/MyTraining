package lesson16.task10;

import java.util.HashMap;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        HashMap<String, Pet> map = new HashMap<>();
        map.put("Toby", new Dog("Toby","m"));
        map.put("Bobby", new Cat("Bobby","m"));
        map.put("Katy", new Parrot("Katy","w"));
        map.put("Sara", new Cat("Sara","w"));
        printPet(map);
    }

    public static void printPet(HashMap<String,Pet> map){
        Set<String> keys=map.keySet();
        System.out.println(keys);
    }
}
