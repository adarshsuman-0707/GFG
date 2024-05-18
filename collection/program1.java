package collection;

import java.util.*;

/**
 * program1
 */
public class program1 {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>(20);
        ArrayList<Integer> all2 = new ArrayList<>(List.of(20, 30, 5, 0, 26));

        all.add(34);
        all.add(230);
        all.remove(1);
        all.addAll(0, all2);
        // all.add(0,3);

        System.out.println(all.indexOf(230));
        all.set(0, 6);
        System.out.println(all);

        // for(int i=0;i<all.size();i++){
        // System.out.println(all.get(i));
        // // }
        // for (var x : all) {
        //     System.out.println(x);
        // }


        // all.forEach(n->System.out.println(n));
        all.forEach(System.out :: println);
        all.forEach(n->show(n));
        
    }
    static void show(int n){
        if(n>60){
            System.out.println(n);
        }
    }

}