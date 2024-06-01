package collection;
import java.util.*;
public class Linklist {
public static void main(String[] args) {
    LinkedList l1=new LinkedList();
    l1.addFirst("ADarsh");
    l1.addLast("suman");
    l1.add(1,"College");
    System.out.println(l1.get(1));
System.out.println(l1.getFirst());

Stack<Integer> s1=new Stack<>();
s1.push(23);
s1.push(23);
s1.push(23);
s1.push(23);
s1.push(23);
System.out.println(s1.search(23));
s1.peek();
s1.pop();
s1.elements();
Enumeration k=s1.elements();
while(k.hasMoreElements()){
    System.out.print(k.nextElement()+" ");
}

Iterator i=s1.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}
// s1.forEach((h)->System.out.println(h));

// Cursor 

Vector v=new Vector<>();
v.add(12);
v.add(15);
v.add(16);
v.add(17);
v.add(18);

Enumeration k1=v.elements();
while(k1.hasMoreElements()){
    System.out.print(k1.nextElement()+" ");
}

ListIterator lj=v.listIterator();
while(lj.hasNext()){
    System.out.println(lj.next());
}
while(lj.hasPrevious()){
    System.out.println(lj.previous());
}
}    

}
