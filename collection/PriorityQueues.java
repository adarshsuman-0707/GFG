package collection;
import java.util.*;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> s =new PriorityQueue<>();
        s.add(20);
        s.add(10);
        s.add(30);
        s.add(5);
        s.add(15);
        s.add(3);
        // s.remove(3);
        System.out.println(s.peek());
        s.forEach(h->System.out.print(h + " "));
        s.poll();
        System.out.println();
        s.forEach(h->System.out.print(h + " "));
  
    }
}
