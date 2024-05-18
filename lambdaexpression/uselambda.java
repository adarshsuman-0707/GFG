package lambdaexpression;

/**
 * Inneruselambda
 */
 interface Inneruselambda {
void display();
    
}
 class uselambdas {
    public void callLambda(Inneruselambda s){
        s.display();
    }
}

 class uselambdass{
    void mnethod1(){
        uselambdas ul=new uselambdas();
        // ul.callLambda(new Inneruselambda(){
        //     public void display(){
        //         System.out.println("hello bhaiya");
        //     }
        // });
        // Second trick
        ul.callLambda(()->{System.out.println("run hogaya"); });
    }
}
public class uselambda {
public static void main(String[] args) {
    

uselambdass d=new uselambdass();
d.mnethod1();
}}