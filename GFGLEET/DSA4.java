package GFGLEET;

import java.util.HashSet;

public class DSA4 {
    static int numsquare(int a) {
        int sum = 0;
        while (a != 0) {

            int rem = a % 10;
            sum = sum + rem * rem;
            a = a / 10;
        }
        return sum;
    }

    static boolean Hanum(int a) {

        HashSet<Integer> hs = new HashSet<>();
        while (true) {
            int num = numsquare(a);

            if (num == 1) {
                return true;
            }
            if (hs.contains(num)) {
                return false;
            }
            hs.add(num);
            a = num;
        }
    }

    public static void main(String[] args) {

        int happy = 19;
        boolean a = Hanum(happy);
        System.out.println(a);

    }
}
