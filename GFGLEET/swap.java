import java.util.Scanner;

class Swap {
    public static int countSwapsAscending(int[] arr) {
        int count = 0;
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return count;
    }

    public static int countSwapsDescending(int[] arr) {
        int count = 0;
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int ascendingSwaps = countSwapsAscending(arr.clone());
        int descendingSwaps = countSwapsDescending(arr.clone());
        int minSwaps = Math.min(ascendingSwaps, descendingSwaps);
        System.out.println(minSwaps);
    }
}
