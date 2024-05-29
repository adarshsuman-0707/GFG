package GFGLEET;
import java.util.*;
public class Guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Math.random() * 100;
        int nums = (int) Math.floor(num);
        int count = 0;
        while (nums != 0) {
            System.out.println("Guess the number:");
            int guess = sc.nextInt();
            if (guess == nums) {
                System.out.println("Congratulation you guessing a right number in " + count + " attempts");
                break;
            } else if(guess>nums+10){
                System.out.println("you guessing too high");
                count++;
            }
            else if(guess<nums-10){
                System.out.println("you guess too low");
                count++;
            }
            else {
                System.out.println("sorry!!! you guessing  the wrong  number");
                count++;
            }
        }
    }
}
