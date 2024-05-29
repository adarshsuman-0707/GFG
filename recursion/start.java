package recursion;

public class start {
    
    static void message(int i){
        if(i<=1){
            return;
        }
        else{
            System.out.println("hello"); 
            
       
        }
            message(i--);
    }
    static boolean check(int n){
        if(n<=1){
                return true;
            }
        for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){return false; }
        }

        return true;
    }
    public static void main(String[] args) {
        
        // message(5);
// here check prime number
boolean s=check(4);
System.out.println(s);
    }
}
