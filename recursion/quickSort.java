package recursion;

// small testCase ke liye merge sort is better it take less space in memory
// and quick Sort is use for large dataset and it's a Fastest sorting algorithm
// quickSort have Pivot and Partioing  the pivot may be last ,first ,mid and randmoized element.


// QuickSort is a Sorting algorithm that uses the pivot and partitioningg approach to sort an array The pivot can be either last or fast or any random element of the array 
// Step 1 :  set the pivot element and intitalize 2 pointer [i,j] where  I is equals to J - 1
// step 2 :  compare the jth element and the pivot element 
// 2.1 : if element is greater than pivot so do j++;
// 2.2 : else   do i++ and j then swap ith and jth element 
// 2.3  : repeat step 2 untill jth reached pivot
// step 3 : do i++ and swap ith and pivot element 
// step 5: repeat steps 1 to 4 untill the array become sorted 

 

public class quickSort {
    public static int partiton(int arr[],int s,int e){
        int pivot=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;

        return i;


    }
    public  static void quickpartition(int arr[],int s,int end){
        if(s>=end){
            return;
        }
        int pivot= partiton(arr,s,end);
        quickpartition(arr, s,pivot-1);
        quickpartition(arr,pivot+1,end);


    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 ,6};
        int n = arr.length - 1; // Last index
        quickpartition(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
