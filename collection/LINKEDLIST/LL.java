package collection.LINKEDLIST;

public class LL {

    static int size = 0;
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            // this keyword point correct instance
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            addFirst(data);
            return;
        }
        if (pos == size) {

            addLast(data);
            return;
        }
     int i=1;
     Node temp=head;
     while(i<pos){
       temp=temp.next;
        i++;
     }
     newNode.next=temp.next;
     temp.next=newNode;

    }

    public static void main(String[] args) {
        LL list = new LL();
       
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.add(6, 1);
        list.print();
        // System.out.println(list);

    }
}
