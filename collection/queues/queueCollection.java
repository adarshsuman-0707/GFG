package collection.queues;
import java.util.*;
public class queueCollection {
    
    public static void main(String[]args) {
        LinkedList <Integer> q1=new LinkedList<>();
        
        q1.add(5);
        q1.add(5);
        q1.add(5);
        q1.add(5);

        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
        System.out.println("kjghf");
    }
}
