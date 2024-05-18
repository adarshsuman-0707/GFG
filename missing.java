import java.util.*;

class missing {
    static int missingNumber(int array[], int n,int total,int sum) {
       for(int i=0;i<n;i++){
            sum=array[i]+sum;   
        }
        int missing =total-sum;
        return missing;
            }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.println("Enter the Element: ");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int total=n*(n+1)/2;    
  int element= missingNumber(arr,n,total,sum);
  System.out.println("Missing Element :" +element);
    }

}