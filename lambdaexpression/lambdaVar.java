package lambdaexpression;
//lambda expression only access/capture local variable if be they are finaland modified inside the method

/**
 *  Mylamda
 */
 interface  Mylamda {
void display();
public static final int count=243;
    
}
class demo{ 
       int count=0;
   public void method1(){
int no=34;
//its not accessable inside the lambda expression


        Mylamda m = () -> {
            //its not access the local variable which is present inside the class 

            int a=43;
            System.out.println(a);
            System.out.println("hello");
            System.out.println(++count);
        };
        m.display();
        count++;

    }
}
public class lambdaVar {
    public static void main(String[] args) {
        demo d=new demo();
        d.method1();
    }
}
