package lambdaexpression;


/**
 * InnerclaculLambda
 */
 interface inner {
    // String name(String s);
    int subtract(int l,int k);
}
/**
 * InnerclaculLambda
 */
 interface outer {
    String name(String s);

    
}
class namse{
    void call(outer r){
        r.name("soniya");
    }
}
class sol{
void method2(){
    namse ns=new namse();
    ns.call((s)->{
        System.out.println(s);
        return "Lion";
    });
}
}
class finl{
   public void calling(inner i){
// i.name("sonu");
i.subtract(23,44 );

    }
}

class solution{
    void method(){
        finl f= new finl();
        f.calling((l,k) ->{
            int ans=l-k;
            System.out.println(ans);
            return ans ;
        });
    }
}
public class claculLambda {
    public static void main(String[] args) {
        solution ssd=new solution();
        ssd.method();
        sol sd=new sol();
        sd.method2();
    }
    
}
