package lessson16.Practise;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<HeavyBox> queue=new ArrayDeque<>();
        queue.offer(new HeavyBox(2,3,4,5 ));
        queue.offer(new HeavyBox(2,3,4,1 ));
        queue.offer(new HeavyBox(2,3,4,2 ));
        queue.offer(new HeavyBox(2,3,4,10 ));
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
