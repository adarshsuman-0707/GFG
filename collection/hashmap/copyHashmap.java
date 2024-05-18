package collection.hashmap;
import java.util.*;
public class copyHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        
        map.put(1,"Suman");
        map.put(2,"adarsh");
        map.put(3,"Manoj");
        System.out.println(map);
        HashMap<Integer,String> map1=new HashMap<>();
        
        map.put(4,"anuj");
        map.put(5,"jain");
        map.put(6,"nice");
        System.out.println(map1);
        // map.putAll(map1);
        System.out.println(map );
        map.clear();
        System.out.println(map);
    }
}
