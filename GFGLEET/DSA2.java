// // HEre check the given array is pallindrome or not 
package GFGLEET;
import java.util.*;
// import java.lang.*;

// public class DSA2 {


// static int checks(int arr[],int n){

// for(int i=0;i<n;i++){
//     int k=arr[i];
//     int reverseNum=0;
//     int orignalNum=k;

// while(k>0){
// int rem=k%10;
// reverseNum =reverseNum*10+ rem;
// k=k/10;
// }
// if(reverseNum != orignalNum){
//     return 0;
// }
// }
// return 1;

// }
//     public static void main(String[] args) {
//         int arr[]={111,222,333,444,555};
//         int n=arr.length;
//         int ans=checks(arr,n);
//         System.out.println(ans);

//     }
// }
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               
               for(int i=0;i<n;i++){
                   int number=a[i];
                   int reverseNumber=0;
                   int OrignalNumber=number;
                   
                   while(number>0){
                      int rem=number%10;
                      reverseNumber = reverseNumber*10+rem;
                      number=number/10;
                   }
                   if(reverseNumber!= OrignalNumber){
                       return 0;
                   }
                   
                   
               }
               return 1;
                
                
           }
           
           
           public static void main(String []args){
               Scanner sc=new Scanner(System.in);
               int size=sc.nextInt();
               int arr[]=new int[size];
               for(int i=0;i<size;i++){
                   arr[i]=sc.nextInt();
               }
              System.out.println(palinArray(arr,size));
           }
}
