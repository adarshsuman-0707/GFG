package GFGLEET;
import java.util.*;

class DSA6{
    public int evalRPN(String[] tokens) {
            Deque <Integer> stack=new ArrayDeque<>();
    for(String str : tokens){
        if(str.length()>1 || Character.isDigit(str.charAt(0))){
            stack.push(Integer.parseInt(str));
        }
        else{
            int y=stack.pop();
            int x=stack.pop();
            switch (str) {
                case "+":
                    stack.push(x+y);
                    break;
                    case "-":
                    stack.push(x-y);
                    break;
                    case "*":
                    stack.push(x*y);
                    break;
            
                default:
                stack.push(x/y);
                    break;
            }
        }
    }

            return stack.pop();
    }

}