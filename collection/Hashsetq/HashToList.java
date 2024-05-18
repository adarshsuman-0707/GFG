package collection.Hashsetq;
import java.util.*;
public class HashToList {
    
    public static void main(String[] args) {
        HashSet <String> hs=new HashSet<>();
        // ArrayList<String> hash_Set=new ArrayList<String>();
        hs.add("Green");
        hs.add("Red");
        hs.add("blue");
        hs.add("yellow");
        hs.add("black");
        hs.add("orange");
        System.out.println(hs);
        ArrayList<String> hash_Set=new ArrayList<String>(hs);
        System.out.println(hash_Set);
        System.out.println(hash_Set.size());
        System.out.println(hash_Set.contains("Red"));
        for(int i=0;i<hash_Set.size();i++){
            if(hash_Set.containsAll(hs)){
                System.out.println(hash_Set);
            }

        }
        hash_Set.remove("Red");
        System.out.println(hash_Set);
        


    }
}
