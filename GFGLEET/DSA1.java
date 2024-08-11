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

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(int arr[]) {
    long Maxsum=0;
    long Minsum=0;
    int sum=0;
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            if(arr[i] ==arr[n-i]){
                    // sum=arr[i]+arr[j];
            }else{
                 sum=arr[i]+arr[j];
            }
                if(sum>Maxsum){
                    Maxsum=sum;
                    Minsum=Maxsum;
                }
                if(Minsum<sum){
                    Minsum=sum;
                }
                
            }
        }
        
        System.out.println(Minsum +  " "+ Maxsum);
        
        

    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
    }
     miniMaxSum(arr);
}
}



public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
    }
}