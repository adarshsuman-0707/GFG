package collection.hashmap;
import java.util.*;

public class ShallowCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        
        map.put(1,"Suman");
        map.put(2,"adarsh");
        map.put(3,"Manoj");
        HashMap<Integer,String> maps=new HashMap<>();
        maps=(HashMap)map.clone();
        System.out.println("new maps" + maps);
        
    }
}
