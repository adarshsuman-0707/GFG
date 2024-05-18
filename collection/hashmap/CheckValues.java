package collection.hashmap;
import java.util.*;
public class CheckValues {
    public static void main(String[] args) {
        HashMap <Integer,String> map=new HashMap<>();
        map.put(1,"Green");
        map.put(2,"Orange");
        map.put(3,"Red");
        map.put(4,"Yellow");

        if(map.containsKey(1)){
            System.out.println(" Key 1 is present so value is " + map.get(1));
        }
        else{
            System.out.println("not present key 1");
        }
        if(map.containsKey(5)){
            System.out.println(" value is " + map.get(5));
        }
        else{
            System.out.println("not present key 5");
        }
        Set hash_map= map.keySet();
        System.out.println(hash_map);
        
    }
}
