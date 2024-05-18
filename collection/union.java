package collection;
import java.util.*;
public class union {
    
    static int Union(int num1[],int num2[]){
        HashSet <Integer> set =new HashSet<>();
        int n1=num1.length;
        int n2=num2.length;
        for(int i=0;i<n1;i++){
            set.add(num1[i]);
        }
        for(int j=0;j<n2;j++){
        set.add(num2[j]);
        }
        set.forEach((h)->System.out.println(h));
        return 0;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
Union(arr1, arr2);
    }
}
