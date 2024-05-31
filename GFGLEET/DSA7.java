package GFGLEET;

public class DSA7 {
    static int[] finding(int[] arr) {
        int n = arr.length;
        int num[] = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    found = true;
                }

            }
            if (!found) {
                num[index++] = arr[i];
                if (index > 2) {
                    break;
                }
            }

        }

        return num;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 3, 5 };
        int arrs[] = finding(arr);
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

    }

}
