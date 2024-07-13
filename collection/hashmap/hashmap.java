package collection.hashmap;
import java.util.*;

public class hashmap {
    static void majority(int nums[]){
        HashMap <Integer,Integer> set =new HashMap<>();
        int n=nums.length;
     
            for(int i=0;i<n;i++){
            if(set.containsKey(nums[i])){
                set.put(nums[i],set.get(nums[i])+1);
            }
            else{ //fLASE
              set.put(nums[i],1);

            } 
        }

        for(int key:set.keySet()){
            if(set.get(key)>n/3){
                System.out.println(key);
            }
        }
        // set.forEach((h,k)->System.out.println(k));

    }
        public static void main(String[] args) 
    {
        int arr[]={1,3,2,2,2,2,2,2,5,1,3,1,5,1};
        majority(arr);
        HashMap <Integer,Integer> setl =new HashMap<>();
        setl.put(1,134);
        setl.put(2,133);
 
    }

}
