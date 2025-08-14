package collection.queues;

import java.util.*;

public class sorts {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode dummy = head;
        ListNode dummy1 = head;

        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        if (len > 1 && k == 0 || len == k) {
            return head;
        }
        int pos = len - k % len;
        len = 1;
        temp.next = head;
        while (dummy.next != null && len <= pos) {
            dummy1 = dummy;
            dummy = dummy.next;
            len++;
        }
        dummy1.next = null;
        return dummy;
    }
}
