package collection.stackcollection;

import java.util.*;

public class stackarrList {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int data) {
        list.add(0, data);
    }

    public int pop() {
        if (list.size() == 0) {
            return -1;
        }

        return list.remove(0);
    }

    public int peek() {
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isempty() {

        return list.size() == 0;
    }

    public static void main(String[] args) {
        stackarrList k = new stackarrList();
        k.push(3);
        k.push(4);
        k.push(5);
        System.out.println(k.isempty());
        // k.pop();
        // k.pop();
        // k.pop();
        // System.out.println(k.isempty());
        while(!k.isempty()){
            System.out.println(k.pop());
        }

    }
}

// 22 , 682 ,32