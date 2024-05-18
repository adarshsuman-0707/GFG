package collection.Hashsetq;
import java.util.*;
public class iteratorlSet {
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
        for (String string : hs) {
            System.out.println(string);
        }
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        hs.removeAll(hs);
        System.out.println(hs.isEmpty());


        HashSet hass=new HashSet<>();
        hass.add(1233);
        hass.add("suman");
        System.out.println(hass);
        hass.add(true);
        System.out.println(hass);

    }
}
