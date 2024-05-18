package collection;

import java.util.*;

public class intersection {

    static int intersectio(int num1[], int num2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int n1 = num1.length;
        int n2 = num2.length;
        for (int i = 0; i < n1; i++) {
            set.add(num1[i]);
        }
        for (int j = 0; j < n2; j++) {
            if (set.contains(num2[j])) {
                // match
                count++; // HERe count increase if element already exist
                System.out.println("intersection Element : " + num2[j]);
                set.remove(num2[j]); // ELement is match that's why element remove from set

            }
        }
        // set.forEach((h)->System.out.println(h));
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        int ans = intersectio(arr1, arr2);
        System.out.println("Total count :" + ans);
    }
}
