package ll;

import java.util.List;

public class LinkedList {


    public static void traverse(ListNode head){
        if(head==null){
            return;
        }

        while(head !=null){
            System.out.print(head.getData() + " -> ");
            head = head.getNext(); // head points to the next node
        }
        System.out.println();
    }

    public static void traverseRec(ListNode head){

        //Bc
        if(head == null){
            return;
        }
        System.out.print(head.getData()+" -> ");
        traverse(head.getNext());

    }

    /**
     * TC : O(n)
     */
    public static int length(ListNode head){
        int count =0 ;
        while(head!=null){
            count++;
            head = head.getNext();
        }

        return count;
    }

    public static void main(String[] args) {
        /**
         *   1 ->2 ->3 ->4 ->null
         */
        //Constructors
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        //Next node is set using setters
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        //node1 is the head here

        traverse(node1);

        traverse(node1);

        System.out.println(length(node3));

    }
}
