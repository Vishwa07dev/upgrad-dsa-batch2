package ll;

public class May7_2022 {

    public static ListNode reverse(ListNode head){

        if(head==null || head.getNext()==null){
            return head ;
        }
        ListNode prev = null;
        ListNode curr = head ;
        while(curr!=null){
            ListNode next  = curr.getNext();
            curr.setNext(prev);
            prev =curr;
            curr = next;
        }
        return prev ;
    }

    public static ListNode mergeSecondToFirst(ListNode head1 , ListNode head2){

        ListNode current = head1;

        while(current!=null && head2!=null){
            ListNode sNext = head2.getNext();
            head2.setNext(current.getNext());
            current.setNext(head2);
            head2 = sNext;
            current = current.getNext().getNext();

        }
        return head1;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);

        LinkedList.traverse(node1);
        System.out.println();
        LinkedList.traverse(node5);

        System.out.println();
        ListNode head = mergeSecondToFirst(node1, node5);
        LinkedList.traverse(head);
    }
}
