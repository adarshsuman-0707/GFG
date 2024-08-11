package sorting;

public class TortoiseLink {
    public ListNode middleNode(ListNode head) {
if(head.next==null){
return head;
}
        ListNode tor=head;
        ListNode rab=head;
        while(rab!=null && rab.next!=null){
            rab=rab.next.next;
            tor=tor.next;
        }
        return tor;    
}
}
