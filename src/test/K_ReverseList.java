package test;

public class K_ReverseList {
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
        ListNode node = reverseKGroup(head,2);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode rear = dummy;

        while(rear.next != null){
            for(int i = 0;i < k && rear != null;i++){
                rear = rear.next;
            }
            if(rear == null){
                break;
            }
            ListNode next = rear.next;
            rear.next = null;
            ListNode start = pre.next;
            pre.next = reverse(start);
            //System.out.println(start.val+"dfdf");
            start.next = next;
            pre = start;
            rear = pre;
        }
        return dummy.next;
    }
    private static ListNode reverse(ListNode head){
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
