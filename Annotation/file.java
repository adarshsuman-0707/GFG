package Annotation;
import java.util.*;
class oldfile{

    public void display(){}
}

class fileshow extends oldfile{
    @Override
    public void display(){}
    @Deprecated
    public void show(){
        System.out.println("hi");
    }
}
public class file{
    // static List l;

    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
     
        fileshow f1=new fileshow();
            f1.show();
    }

}