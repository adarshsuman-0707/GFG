package GFGLEET;

import java.util.*;
public class DSA9 {
    static void reverse(String chec){
       String rev ="";
      for(int i=chec.length()-1;i>=0;i--){
        rev += chec.charAt(i);
      }
  
      if(chec.equals(rev)){
        System.out.println("yes");
      }
      else{
        System.out.println("NO");
      }
    }
    public static void main(String[] args) {
        DSA9 obj = new DSA9();
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        reverse(s);
    }
}
