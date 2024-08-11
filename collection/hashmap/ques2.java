package collection.hashmap;

import java.util.*;

// leetcode3005 Find count Element with Maximum Frequency of element 
class ques2{
public static void main(String[] args) {
    int arr[]={-1,-7,7,5,2,3,4};
HashMap <Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);

        }
    }
    // System.out.println(map);
    int max=0;
    for(int nums:map.values()){
        // System.out.println(nums);
        max=Math.max(nums,max);
    }
    // System.out.println(max);
    int res=0;
    for(int i : map.values()){
        if(i==max) res+=i;
    }
    System.out.println(res);


    ques3 o=new ques3();
   int i= o.findMaxK(arr);
   System.out.println(i);
}
}

//  int this question we solve this 
class ques3{
    
        public int findMaxK(int[] nums) {
            Arrays.sort(nums);
    
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if (-nums[i] == nums[j]) return nums[j];
                else if (-nums[i] > nums[j]) i++;
                else j--;
            }
    
            return -1;
        }
    
}