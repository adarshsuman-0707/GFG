package GFGLEET;

import java.util.*;

import lambdaexpression.lambdaVar;

public class DSA3 {
        static int singlenumber(int nums[]){
            Arrays.sort(nums);
            int k=0;
            int j=0;
            int n=nums.length;int ch =0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
            for(int l=1;l<n;l++){
                k=nums[i];
                j=nums[l];
                ch = k&j;
                arr[i]=ch;     
               }
            }
            int l=arr.length;
           int ans=arr[l-1];
            return ans;
        }
    public static void main(String[] args) {
        int arr[] = {2,2,3,2};
       int ans= singlenumber(arr);
       System.out.println(ans);
    }
}



















 // static int total(int arr[], int n) {
    //     int one = 0;
    //     int two = 0;
    //     for (int num : arr) {

    //         two |= one & num;

    //         one ^= num;
    //         int commonbits = one & two;
    //         one &= ~commonbits;
    //         two &= ~commonbits;
    //     }
    //     return one;
    //     }
