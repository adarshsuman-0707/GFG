package lambdaexpression;

/**
 *  chck
 */
 interface  chck {
int add(int a,int b);

}
public class lampra {
    public static void main(String[] args) {
     //one trick
        // chck ch=(a,b)->{
        //     System.out.println(a+b);
        // };

        //second trick
        chck ch=(a,b)->{return a+b;};
        // System.out.println(ch.add(3,4));
        int c=ch.add(3,4);
        System.out.println(c);
        //third trick
  chck cl=(a,b)->a+b;
  int d=cl.add(3,23);
  System.out.println(d);
    }
}
