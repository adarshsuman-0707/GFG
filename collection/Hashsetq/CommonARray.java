package collection.Hashsetq;


import java.util.*;

public class CommonARray {
   
    public static int find(int nums[],int []nums2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
          for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int minValue=Integer.MAX_VALUE;
        for(int i:set){
          minValue=  Math.min(minValue,i);
        }
      return minValue;

        
    }
        public static void main(String[] args) {
            int nums[]={1,2,3};
            int nums2[]={2,4};
              int min =find(nums,nums2);

            System.out.println(min);
        }
            

}
