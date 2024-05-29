package files;
import java.util.*;

public class evenfabanacci {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int n1 = 10;
    //     int n2 = 12;
    //     int n = sc.nextInt();
    //     int n3 = 0;
    //     System.out.print(n1 + " " + n2 + " ");
    //     for (int i = 2; i <= n; i=i+2) {
    //         n3 = n1 + n2;
    //         n1 = n2;
    //         n2 = n3;
    //         if(n3%2==0)
    //         System.out.print(n3 +" ");

    //     }
    // }
    static long a(int n) {
        double sqrt5 = Math.sqrt(5.0);
        return (long)(-10 + (5 - 3 * sqrt5) * Math.pow(2 - sqrt5, n) + Math.pow(2 + sqrt5, n)*(5 + 3*sqrt5))/20;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
        
        for (int n = 2; n < 4; n++) {
            System.out.println(a(n));
        }
 
    }


}
