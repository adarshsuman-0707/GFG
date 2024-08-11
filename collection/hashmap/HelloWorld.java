// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package collection.hashmap;

import java.util.*;

class HelloWorld {
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }

        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);

            } else {
                h.put(arr[i], 1);
            }
        }
        HashMap<Integer, Integer> h2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (h2.containsKey(arr[i])) {
                h2.put(arr[i] * 2, h.get(arr[i]) + 1);

            } else {
                h2.put(arr[i] * 2, 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (h.containsKey(arr[i]) == h2.containsKey(arr[i])) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3,1,7,11};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
}
