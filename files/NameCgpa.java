package files;
import java.io.*;
import java.util.*;


interface Food{
    void Pizza();
    void cake();
}
class pizza implements Food{
     public void Pizza(){
        System.out.println("The factory returned class Pizza");
   System.out.println("Someone ordered a Fast Food!"); 
     }
     public void cake(){
         
     }
}

class Cake implements Food{
     public void cake(){
        System.out.println("The factory returned class Cake");
   System.out.println("Someone ordered a Dessert!"); 
     }
     public void Pizza(){
        System.out.println("The factory returned class Pizza");
        System.out.println("Someone ordered a Fast Food!"); 
     }
}


public class NameCgpa {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Cake c=new Cake();
String name="cake";
String s=sc.nextLine();
if(name==s){
 c.cake();   
}
c.Pizza();


    }}

