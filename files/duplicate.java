package files;
import java.util.*;
public class duplicate {

    void take(int arr[],int n) {
        System.out.print("The duplicate Element in array is : " );
          for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (arr[i] == arr[k] && i != k && i < k) {
                    System.out.print(arr[k] + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.println("Enter the Element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        duplicate dc = new duplicate();
        dc.take(arr,n);
    }
}
