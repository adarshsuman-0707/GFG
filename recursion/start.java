package recursion;

public class start {
    
     void message(int i){
        if(i<=1){
            return;
        }
        else{
            System.out.println("hello"); 
            
       
        }
            message(i--);
    }
    static boolean checkprime(int n){
        if(n<=1){
                return true;
            }
        for(int i=2;i<=n;i++){
            if(n==i){
                return true;
            }
             if(n%i==0){return false; }
        }

        return true;
    }
    // public static void main(String[] args) {
    start(){    
        // message(5);
// here check prime number
boolean s=checkprime(12);
System.out.println(s);
    }
}
