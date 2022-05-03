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

    /**
     *   TC : O(n)
     */
    public static ListNode insertAtK(ListNode head , int data ,int k){

         if(head ==null && k!=0){  // head==null, k=0  new ListNode(data)
             return head ;
         }
         //if k is the valid index
        if(k<0 || k>length(head)){
            return head ;
        }

        ListNode newNode = new ListNode(data);

        if(k==0){  // I need add the new node at head
            newNode.setNext(head);
            head = newNode; // head is pointing to the new node now
        }else{
            int count = 0;
            ListNode temp = head ;
            while(count < k-1){
                temp= temp.getNext();
                count++;
            }
            //temp will represent one node before the target node

            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
       return head ;

    }


    /**
     * Assignment
     *
     */
    public static ListNode delete(ListNode head , int k){
        /**
         * code to delete the node at the kth index ( index starts from 0 );
         */
        return null ;
    }


    public boolean isPresent(ListNode head , int data){
        if(head ==null){
            return false ;
        }

        while(head!=null){
            if(head.getData() == data){
                return true;
            }
            head = head.getNext();
        }
        return false ;
    }

    public boolean isPresentRec(ListNode head, int data){
        //BC
        if(head ==null){
            return false ;
        }

      return   head.getData() == data || isPresentRec(head.getNext(), data) ;

    }


    public ListNode findMid(ListNode head){
        if(head ==null){
            return head ;
        }

        int length = length(head);  // 1 traversal

        int count =0 ;
        ListNode temp = head;
        while( count<length/2){   // Second traversal
             temp = temp.getNext();
             count++;
        }
        return temp ;
    }


    public ListNode findMidNode(ListNode head){

        if(head ==null || head.getNext()==null){
            return head ;
        }

        ListNode slow = head;
        ListNode fast  = head ;

        while(fast!=null && fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        //slow will be at the middle
        return slow ;
    }


    public boolean hasLoop(ListNode head){
        if(head ==null || head.getNext()==null){
            return false ;

        }
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();

            if(fast ==slow){
                return true ;
            }
        }

        return false ;
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
