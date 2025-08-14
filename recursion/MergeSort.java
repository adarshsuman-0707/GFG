package recursion;

// ### Merge Sort Algorithm Steps: 

// 1. **Divide**: 
//    - If the array has one or zero elements, it is already sorted. Return it. 
//    - Otherwise, divide the array into two halves. 

// 2. **Conquer**: 
//    - Recursively apply the merge sort to both halves of the array. 

// 3. **Combine**: 
//    - Merge the two sorted halves back into a single sorted array.

//step1: place two pointer one at the starting and one at the ending of array
//step2: calculate mid and divide the array from that mid point
//step3: repeat step2 until the array id divided into in single size subarray
// step4 : start merging the subarray such that the resulting subarray is sorted 
// step5: combine .Merge the all these subarray to get the final sorted array.

public class MergeSort {
    static void Merge(int arr[], int s, int m, int e) {
        int l = m - s + 1; // Length of left subarray
        int r = e - m;     // Length of right subarray
        int left[] = new int[l];
        int right[] = new int[r];

        // Copy data to left subarray
        for (int i = 0; i < l; i++) {
            left[i] = arr[s + i]; // Corrected index
        }
        
        // Copy data to right subarray
        for (int j = 0; j < r; j++) {
            right[j] = arr[m + 1 + j]; // Corrected index
        }

        int i = 0, j = 0; // Pointers for left and right
        int k = s; // Pointer for the main array

        // Merge the left and right subarrays
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i < l) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right subarray, if any
        while (j < r) {
            arr[k++] = right[j++]; // Corrected index
        }
    }

    public static void Msort(int arr[], int start, int end) {
        if (start >= end) { // Corrected base case
            return;
        }
        int mid = start + (end - start) / 2;
        Msort(arr, start, mid);
        Msort(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 20, 75, 2, 1 };
        int n = arr.length - 1; // Last index
        Msort(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}