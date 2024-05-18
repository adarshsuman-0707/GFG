package lambdaexpression;

@FunctionalInterface
/**
 * Mylamda
 */
 interface Mylamda {
  void display();
// public static final int k=9;
   
}
/**
 * My implements Mylamda
//  */
//  class My implements Mylamda {
// public  void display() {
//     System.out.println("HEllo world");
    
// }
    
//}
public class LamdaDemo {
    public static void main(String[] args) {
        /**
         * lambda expression
         */

        //  this bracket show display method defination
        Mylamda m = ()-> {  System.out.println("Hello world");  };
        m.display();
        
    }
}
