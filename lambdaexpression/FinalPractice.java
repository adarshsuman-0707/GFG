package lambdaexpression;

/**
 * Check
 */
 interface check {
//  void test();
int test(int n,int s);

}
class Finding{
    public void calling(check c){
        c.test(22323,33);

    }
}

class fina{
    void method1(){
        Finding f=new Finding();
        f.calling((n,s)->{
            if(n%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            return 3;
        });
    }
}

public class FinalPractice  {
public static void main(String[] args) {
    fina s=new fina();
    s.method1();
}
}


// class Finding{
// public void calling(Check c){
// c.test(23323);
// //    System.out.println(s);
// }
// }
// class fina{
//     void method1(){
//         Finding F =new Finding();
//   F.calling((n)->{
//             if(n%2==0){
//                 System.out.println("even");
//             }
//             else{
//                 System.out.println("odd");
//             }
//             return 0;
//         });
//     }
// }
// public class FinalPractice{
//     public static void main(String[] args) {
        
    
//     fina f=new fina();
//     f.method1();
// }}