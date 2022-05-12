package ll;

public class May12 {

    public ListNode addOne(ListNode head){
        if(head == null){
            return new ListNode(1);
        }

        head = May7_2022.reverse(head);

        /**
         * Logic to add 1 to this reversed LL
         */

        head = addOneUtil(head);
        head = May7_2022.reverse(head);

        return head;
    }

    private ListNode addOneUtil(ListNode head) {

        ListNode res = head ;
        ListNode temp = null, prev=null;
        int carry=1;// Why because we have to add 1 to the head
        int sum;
        while(head!=null){
            sum = head.getData() +carry;
            carry = sum>=10 ? 1 : 0;
            sum = sum %10;
            head.setData(sum);
            temp = head ;
            head = head.getNext();
        }

        if(carry>0){
            temp.setNext(new ListNode(carry));
        }

        return res ;
    }


    public static ListNodeWithRandom clone(ListNodeWithRandom head){

        /**
         * Need to first clone each node and set in the original LL itself
         */

        ListNodeWithRandom curr = head, temp = null;

        while(curr !=null){
            temp = curr.getNext();

            curr.setNext(new ListNodeWithRandom(curr.getData()));
            curr.getNext().setNext(temp);
            curr = temp ;
        }

        /**
         * Clone the random pointers
         */
        curr = head ;

        while(curr !=null){
            if(curr.getNext()!=null){
                curr.getNext().setRandom(curr.getRandom().getNext());
                curr= curr.getNext().getNext();
            }
        }

        /**
         * Separarte the original LL and the cloned LL
         */

        ListNodeWithRandom original = head , clone = head.getNext();
        ListNodeWithRandom clonedHead = clone;
        while(original!=null){
            original.setNext(original.getNext().getNext());

            clone.setNext(clone.getNext().getNext());

            original= original.getNext();
            clone= clone.getNext();
        }

        return clonedHead ;
    }


}
