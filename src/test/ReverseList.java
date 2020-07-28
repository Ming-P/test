package test;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next = head4;
        //head4.next = null;
        ListNode node = reverseList(head);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head != null){
           ListNode next = head.next;
           head.next = pre;
           pre = head;
           head = next;
        }
        return pre;
    }
}
