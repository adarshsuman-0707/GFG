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
        int maxOcc=0;
        int maxkey=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                maxOcc=Math.max(maxOcc,entry.getValue());
                maxkey=entry.getKey();
            }
        }
    System.err.println("max frequency "+ maxOcc+ " Key is : " + maxkey);
        // System.out.println(map);//
    }
    // map.forEach((h)->System.out.println(h));
}
//