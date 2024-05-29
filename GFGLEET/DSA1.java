package GFGLEET;

import java.util.Scanner;
import java.util.*;
class DSA1{


    static int findPair(int n,int x,int arr[]){
        Arrays.sort(arr);
        int left=0;
        int right=0;
        while(left<n && right<n){
            int diff=arr[right]-arr[left];

            if(diff==x && left!=right){
                return 1;
            }
            else if(diff<x){
                right++;
            }
            else{
                left++;

            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(1!=9);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println( findPair(n,x,arr));
    }
}