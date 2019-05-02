package lesson16.task5;

import java.util.HashSet;
import java.util.Set;

public class SetTransformationDemo {
    public static void main(String[] args) {
        SetTransformation transformation = new SetTransformation();
       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(5);
        set1.add(10);
        set1.add(15);
        set2.add(12);
        set2.add(30);
        set3.add(48);
        set3.add(5);
        /*Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        set1.add("5");
        set1.add("10");
        set1.add("15");
        set2.add("12");
        set2.add("30");
        set3.add("48");
        set3.add("5");*/

      System.out.println(transformation.union(set1,set2,set3));
      System.out.println(transformation.intersect(set1,set3));
    }
}
