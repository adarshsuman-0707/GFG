package collection;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        System.out.println(arrlist);
        arrlist.set(4,234323);
        System.out.println(arrlist);
        arrlist.remove(4);
        Object arrli=arrlist.toArray();
        for(Object arrl:arrlist){
            System.out.println(arrl);
        }
       System.out.println( arrlist.contains(2));
       Iterator as=arrlist.iterator();
    while (as.hasNext()) {
        System.out.print(as.next() + " ");
    }
    
    arrlist.forEach((h)->System.out.println(h));

    for(int i=0;i<arrlist.size();i++){
        System.out.print(arrlist);
    }
    }

}
