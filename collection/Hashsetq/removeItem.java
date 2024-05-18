package collection.Hashsetq;
import java.util.*;
public class removeItem {
    public static void main(String[] args) {
        HashSet <Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
 
		System.out.println("HashSet Elements : " + nums); 
    // if(nums.removeIf(val->val>6)){
    //     System.out.println("ITem removed succesfully");
    // }
    // else{
    //     System.out.println("not remove");
    // }

    Spliterator<Integer> s=nums.spliterator();
    s.forEachRemaining((h)->System.out.print(h+ " "));
    nums.parallelStream().forEach(System.out::println); // its print random value from set\
    }
}
