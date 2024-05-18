package oops;
import java.util.*;
// Hospital management system

public class Trying {
 /**
  *  work
  */
  Trying(){

  }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do{
        System.out.println(" WELCOME TO HOSPITAL SERVICES ");
        System.out.println("1 - Registration Form");
        System.out.println("2 - search detail");
        System.out.println("3 - Discharge date");
        System.out.println("4 - Cancel your form");
        System.out.println("5 - Payment");
        System.out.println("6 - Exit ");
        int choices=sc.nextInt();
        switch(choices){
            case 1: 

            Registration.call();
            break;
            case 2:
             Registration.Searchdetail.display();
            break;
            case 6:
            flag=1;
            break;
            default:
            System.out.println("please enter again your choice ");
            
        }
        }while(flag==0);

       

    }
}

class Registration{
    static Scanner ssc=new Scanner(System.in);
    static String name;
    static String email;
    static double Number;
    static String Address;
    static int pincode;
    static void call(){
        try{
      System.out.println("Enter your name :");name=ssc.next();
     System.out.println("Enter your email :"); email=ssc.next();
     
    System.out.println("Enter your number :");Number=ssc.nextInt();

    System.out.println("Enter your address :"); Address=ssc.next();
    System.out.println("Enter your pincode :");pincode=ssc.nextInt();
    
     System.out.println("Successfully Registered");
        }catch(Exception e){
            System.out.println("Exception arises");
        }
    }
    class Searchdetail{
      static  void display(){
            System.out.println("patient name is :"+name);
            System.out.println("patient email is :"+email);
            System.out.println("patient Number is :"+Number);
            System.out.println("patient Address is :"+Address);
            System.out.println("patient pincode is :"+pincode);
            
        }
    }
}
