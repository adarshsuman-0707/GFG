package GFGLEET;
import java.lang.*;

import recursion.sumofnatural;
public class DSA8 {
    // static int scoreOfString(String s) {
    //     char a[] = s.toCharArray();
    //     int sum = 0;
    //     for (int i = 0; i < a.length; i++) {
    //         for (int j = i + 1; j < a.length; j++) {
    //             if(a[i]!=a[j]){
    //             int ans = a[i] - a[j];
    //             sum += Math.abs(ans);}
    //         }
    //     }
    //  return sum;

    // }

    // public static void main(String[] args) {
    //     String s = "hello";
    //     int a = scoreOfString(s);
    //     System.out.println(a);
    // }3
    static int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        System.out.println(s.length());
        for (int i = 0; i <s.length()-1; i++) {
            sum+=Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        String input = "hello";
        // int output = scoreOfString(input);
        // System.out.println("Output: " + output);
  
   float String=23;
   System.out.println(d);  
}



}
