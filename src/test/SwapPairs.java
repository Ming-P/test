package test;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        ListNode node = swapPairs(head);
        //System.out.println(node.val);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {

        // Dummy node acts as the prevNode for the head node
        // of the list and hence stores pointer to the head node.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevNode = dummy;
        System.out.println(prevNode);
        while ((head != null) && (head.next != null)) {

            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Reinitializing the head and prevNode for next swap
            prevNode = firstNode;
            System.out.println(prevNode);
            head = firstNode.next; // jump
        }
        //System.out.println(prevNode);

        // Return the new head node.
        return dummy.next;
    }
}
