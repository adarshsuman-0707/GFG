package collection.hashmap;

import java.util.*;

//find max frequency element in array
//given a unsorted array  find a frequency of each element in the array
public class ques1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 2, 2, 2, 3, 1, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        // System.out.println(map);//
        int a = Integer.MIN_VALUE;
        int n = map.size();
                    a = Math.max(a, Entry.getValue());
        }
        System.out.println(a);
        for (Map.Entry<Integer, Integer> Entry : map.entrySet()) {
            if (a == Entry.getValue()) {
                System.out.println("max key frequency : " + Entry.getKey());
            }
        }
    }
    // map.forEach((h)->System.out.println(h));
}
//