import java.util.*;
public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HERE WE ARS EOLVING A HOURGLASS Problem");
        System.out.println("Enter rows:");
        int row = sc.nextInt();
        System.out.println("Enter cols:");
        int col = sc.nextInt();
        System.out.println("Enter values:");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }}
             int sum = 0;
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }}
        int sum1 = 0;
        for (int i = 3; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum1 += arr[i][j];
            }
        }
        System.out.println(sum1);
        int ans=(sum1>sum)? sum1: sum;
        System.out.println(ans);
    }

}
