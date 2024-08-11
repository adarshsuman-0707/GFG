package sorting;
import java.util.*;
class insertionSort{
    public static void main(String[] args) {
        int arr[]={3,2,1};
        short n=(short)arr.length;
        // System.out.println(n);
        for(int i=1;i<n;i++){
         int j=i-1,x=arr[i];
         while(j>=0 && arr[j]>x){
            arr[j+1]=arr[j];
            j--;
         }
         arr[j+1]=x;

        }
        System.out.println(Arrays.toString(arr));
    }
}