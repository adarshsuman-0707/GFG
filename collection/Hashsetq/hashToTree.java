package collection.Hashsetq;
import java.util.*;
public class hashToTree {
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
        TreeSet <String> ts=new TreeSet<>(hs);
        System.out.println(ts);

    }
}
