package collection.hashmap;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;
  
public class JavaHashMapPrograms 
{    
class find{
    static int Maximum(int arr[], int N)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];}}
        return max;
    }
    static int Minimum(int arr[], int N) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }}
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int Size=sc.nextInt();
        int arr[]= new int[Size];
        for(int i=0;i<Size;i++){
            arr[i]=sc.nextInt();
        }    
        System.out.println("MAXIMUM " +find.Maximum(arr,Size));
        System.out.println("Minimum is : " +find.Minimum(arr,Size));

    }
}
