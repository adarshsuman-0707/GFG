package collection.Hashsetq;
 
// remove all Element from Hashset
import java.util.*;
public class newQues {
    
    public static void main(String[] args) {
    HashSet <String> s=new HashSet<String>();
    s.add("pink");
    s.add("Blue");
    s.add("Green");
    s.forEach((h)->System.out.println(h));
    s.clear();
    System.out.println("kuch nhi mila khali hogya");
    s.forEach((h)->System.out.println(h));

    }
}
