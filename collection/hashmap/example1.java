package collection.hashmap;
import java.util.*;

public class example1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        
        map.put(1,"Suman");
        map.put(2,"adarsh");
        map.put(3,"Manoj");
        map.put(4,"Jyoti");
        map.put(5,"Mansi");
        System.out.println(map);
      for(Map.Entry c:map.entrySet()){
        System.out.println(c.getKey()+ " "+ c.getValue());
      }
      System.out.println(map.size());
      
        
    }
    
}
