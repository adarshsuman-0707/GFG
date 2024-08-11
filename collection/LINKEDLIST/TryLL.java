package collection.LINKEDLIST;
public class TryLL {
    Node head;
    static int size=0;
    //inner class 
    class Node{
        int data=0;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    void addFirst(int data){
        Node newNode =new Node(data);
       if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 
    }
    void addLast(int data){
        Node newdata=new Node(data);
        if(head==null){
            head=newdata;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
               temp= temp.next;
            }
            temp.next =newdata;
        }
    }
    void add(int data,int pos){
        Node newdata=new Node(data);
        if(pos==0){
            addFirst(data);
            return;
        }
        if(pos==size){
            addLast(data);
            return;
        }
        int i=1;
        Node temp=head;
        while(i<pos){
            temp=temp.next;
            i++;
        }
     
        newdata.next=temp.next;
        temp.next=newdata;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp =temp.next;
        }
        System.out.println("null");
        

    }
    void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
            size--;
            return;
        }
        head=head.next;
        size--;
    }
    void removeLast(){
        if(head==null){
            System.out.println("list is empty");
            size--;
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
            
        } 
        // Node temp=head;
        // Node prev=null; 
        // while (temp.next != null) {
        //     prev = temp;
        //     temp = temp.next;
        // }
        // prev.next = null;

        // second way 
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

void remove(int pos){
    if(pos==0){
        removeFirst();
        return;
    }
    if(pos==size){
        removeLast();
        return;
    }
    int i=1;
    Node temp=head;
    while(i<pos){
        temp=temp.next;
        i++;
    }
Node x=temp.next;
    temp.next=temp.next.next;
    x.next=null;
    size--;
}


public static void main(String[] args) {
        TryLL t=new  TryLL();
        // t.add(22);
        t.addFirst(22);
        t.addLast(23);
        t.addLast(24);
        t.addLast(25);
        t.addLast(26);
        t.addLast(27);

        t.removeFirst();
        t.removeFirst();
        t.removeLast();
        t.remove(1);
        System.out.println(t.size);

        t.print();
}
}
