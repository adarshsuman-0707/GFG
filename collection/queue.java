package collection;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        ArrayDeque<Integer> s =new ArrayDeque<>();
        s.add(32);
        s.offerLast(12);
        s.offer(1);
        // s.forEach(n->System.out.println(n));
        s.offerFirst(23);
        s.pollLast();
        s.pollFirst();
        s.poll();
    for(var x : s){
        System.out.println(x);
    }
}}
