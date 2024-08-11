package collection;


import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> all = new LinkedList<>();
        LinkedList<Integer> all2 =new LinkedList<>(List.of(1,2,3,4,5,6,7));
    //    all.addAll(all2);

        // all.set(3,33);
        all.add(2);
        all.addFirst(23);
        all.addLast(00);
        // all.removeFirst();
        // all.removeLast();
        
        for(int i=0;i<all.size();i++){
            System.out.print(all.get(i) + " ");
        }
        // for(var x : all){
        //     System.out.println(x);
        // }
    }
    
}
