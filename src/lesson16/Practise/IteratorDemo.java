package lesson16.Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList=new ArrayList<>();
        heavyBoxList.add(new HeavyBox(22, 333, 444, 1000));
        heavyBoxList.add(new HeavyBox(22, 333, 444, 200));
        heavyBoxList.add(new HeavyBox(22, 333, 444, 500));
        heavyBoxList.add(new HeavyBox(22, 333, 444, 10));
        heavyBoxList.add(new HeavyBox(22, 333, 444, 900));
        List<HeavyBox> heavyBoxes =findHeavy(heavyBoxList);
        System.out.println(heavyBoxList);
        System.out.println();
        System.out.println(heavyBoxes);
    }

    private static List<HeavyBox> findHeavy(List<HeavyBox> list){
        List<HeavyBox> result=new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()){
            HeavyBox box=iterator.next();
            if (box.getWeight()>300){
               iterator.remove();
               result.add(box);
            }
        }
        return result;
    }
}
