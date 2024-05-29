public class MergeSort {

    public static void con(int arr[], int st, int ei, int mid) {
        int merged[] = new int[ei - st + 1];
        int idx1 = st;
        int idx2 = mid + 1; // Corrected index
        int track = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[track++] = arr[idx1++];
            } else {
                merged[track++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[track++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[track++] = arr[idx2++];
        }
        for (int i = 0, j = st; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int st, int ei) {
        if (st >= ei) {
            return;
        }
        int mid = (st + ei) / 2; // Corrected calculation
        divide(arr, st, mid);
        divide(arr, mid + 1, ei);
        con(arr, st, ei, mid);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 2, 34, 5, 6, 77, 55, 76 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
