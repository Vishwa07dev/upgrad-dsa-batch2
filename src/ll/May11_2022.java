package ll;

public class May11_2022 {


    /**
     * Reverse the elements in the LinkedList in the pairs of K
     */

    public static ListNode reverseK(ListNode head, int k){
        //Base condition
        if(head ==null){
            return head;
        }
        ListNode current  = head ;
        ListNode next = null;
        ListNode prev = null;
        int count =0 ;
        //reversing the first k elements
        while(count<k && current!=null){
            next = current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
            count++ ;
        }
        if(next!=null){
            head.setNext(reverseK(next, k));
        }

        return prev ;
    }


    /**
     * Insert at the Kth index in Single Linked List
     */
    public static ListNode insert(ListNode head, int data, int k){

        if(head == null && k!=0){
            return head ;
        }
        if(k<0 || k > length(head)){
            return head ;
        }
        ListNode newNode  = new ListNode(data);

        if(k==0){
            //Insert the new node as head
            //Get the node at the
            ListNode tail = findTail(head);
            tail.setNext(newNode);
            newNode.setNext(head);
            head = newNode ; // newNode is made head now
        }else{
            //We need to jump to an index 1 less than the target index
            int count  = 0;
            ListNode temp = head ;

            while(count < k-1){
                temp = temp.getNext();
                count++;
            }

            //temp is now at a node before the target node
            newNode.setNext(temp.getNext().getNext());
            temp.setNext(newNode);
        }

        return head;

    }

    public ListNode deleteAtKth(ListNode head, int k){
        /**
            Add the logic as the assignment
         */
        return null ;
    }

    /**
     * Logic to find the tail
     */
    private static ListNode findTail(ListNode head) {
        if(head == null || head.getNext()==null){
            return head;
        }
        ListNode temp = head;
        while(temp!=null && temp.getNext() !=head){
            temp = temp.getNext();
        }
        return temp ;
    }

    private static int length(ListNode head){
        if(head  ==null){
            return  0;
        }
        int len = 1 ;
        ListNode temp = head.getNext();
        while(temp!=null && temp!=head){
            len++ ;
            temp = temp.getNext();
        }
        return len;
    }

    /**
     * This is a circular LL
     *  tail next will be head
     */
    public static void traverse(ListNode head){

        if(head==null){
            return ;
        }
        System.out.print(head.getData() + " -> ");

        ListNode temp = head.getNext();

        while(temp!=null && temp != head){
            System.out.print(temp.getData() + " -> " );
            temp = temp.getNext();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ListNode head  =  new ListNode(1);
        ListNode node1  = new ListNode(2);
        ListNode node2  = new ListNode(3);
        ListNode node3  = new ListNode(4);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(head);// tail next is head


        traverse(head);

        System.out.println(length(head));

    }
}
