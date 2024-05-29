package recursion;

public class sumofnatural {
    
    static int sumofnatural(int i){
        if(i==1){
            return 1;
        }
        return i+sumofnatural(i-1);
    }
    public static void main(String[] args) {
      int n=  sumofnatural(3);
System.out.println(n);
    }
}
