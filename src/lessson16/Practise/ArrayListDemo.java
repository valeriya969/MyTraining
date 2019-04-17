package lessson16.Practise;

import lesson15.Practise.HeavyBox;
import lesson9.Test.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1,1,1,1));
        list.add(new HeavyBox(4,5,6,7));
        list.add(new HeavyBox(2,2,2,2));
        list.add(new HeavyBox(1,5,8,2));
        for (HeavyBox heavyBox : list) {
            System.out.println(heavyBox.getWeight());
        }
        HeavyBox box1=list.get(0);
        box1.setWeight(box1.getWeight()+1);
        for (HeavyBox heavyBox : list) {
            System.out.println(heavyBox.getWeight());
        }
        list.remove(list.size()-1);
        System.out.println("Size"+list.size());

        Object[] list1=list.toArray();
        System.out.println(Arrays.toString(list1));

        HeavyBox[] heavyBoxes=new HeavyBox[list.size()];
        list.toArray(heavyBoxes);
        System.out.println(Arrays.toString(heavyBoxes));

        HeavyBox[] heavyBoxes1=list.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(heavyBoxes1));
    }

}
