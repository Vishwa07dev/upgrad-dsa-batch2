package practiceProblems;

import ll.ListNode;

public class June202022 {

    public static void printAlternate(ListNode head){

        if(head ==null){
            return;
        }

        while(head!=null){
            System.out.print(head.getData());

            head = head.getNext();
            if(head==null){
                return;
            }
            head= head.getNext();
        }

    }

    /**
     * Convert the above code into recursive solution
     */

}
