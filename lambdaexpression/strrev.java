package lambdaexpression;

/**
 * sttrr
 */
 interface sttrr {

    void display(String str);
}
public class strrev {
    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        // sttrr s=System.out::println;
        // s.display("Hello world");
        sttrr s=strrev::reverse;
        s.display("Hello world");
    }
}
