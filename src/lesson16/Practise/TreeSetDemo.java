package lesson16.Practise;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set=new TreeSet<>();
        set.add(new HeavyBox(2,5,7,9));
        set.add(new HeavyBox(2,8,3,2));
        set.add(new HeavyBox(2,8,4,50));
        set.add(new HeavyBox(2,8,4,11));
        set.forEach(box-> System.out.println(box.getWeight()));
    }
}
