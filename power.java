


public class power {

    static boolean check(int n) {
        if (n == 0) {
            return false;
        }
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n >> 1;
            n--;
        }
        if (count == 1) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {
     int n = 164;
     boolean ans = check(n);
     String anss = (ans == true) ? n + " is the power of 2" : n + " is not power of 2";
     System.out.println(anss);
    }
}
