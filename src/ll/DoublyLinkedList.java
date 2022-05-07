package ll;

public class DoublyLinkedList {



    /**
     * Traverse a DLL
     *
     */
    public static void traverse(DLLNode head){
        if(head==null){
            return ;
        }
        System.out.print(head.getData() + " <-> ");
        traverse(head.getNext());
    }

    /**
     * Find the length of the DLL
     *
     */
    public static int length(DLLNode head){
        return head==null ? 0 : 1 + length(head.getNext());
    }

    /**
     * insert an element in DLL
     *
     */
    public static DLLNode insertAtKthPos(DLLNode head, int data, int k){

        if(head ==null && k!=0){   // there is no node
            return head;
        }
        if(k<0 || k>length(head)){
            return head;
        }
        DLLNode newNode = new DLLNode(data);
        if(k==0){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else{
            int index =0 ;
            DLLNode temp = head ;
            while(index < k-1){
                temp = temp.getNext();
                index++;
            }

            newNode.setNext(temp.getNext());
            temp.getNext().setPrev(newNode);
            temp.setNext(newNode);
            newNode.setPrev(temp);
        }
        return head ;
    }

    public DLLNode insertRec(DLLNode head , int data , int k){
        if(head ==null && k!=0){   // there is no node
            return head;
        }
        if(k<0 || k>length(head)){
            return head;
        }
        if(k==0){
            DLLNode newNode = new DLLNode(data);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else{
            DLLNode tempHead = insertAtKthPos(head.getNext(),data, k-1);
            tempHead.setPrev(head);
            head.setNext(tempHead);
        }

        return  head;
    }

    public static  DLLNode reverse(DLLNode head){

         if(head ==null || head.getNext()==null){
             return head ;
         }

         DLLNode tail = findTail(head);

         DLLNode temp = head ;
         int left = 0;
         int right = length(head)-1;
         while(left <right){
             int t = temp.getData();
             temp.setData(tail.getData());
             tail.setData(t);
             temp = temp.getNext();
             tail = tail.getPrev();
             left++;
             right--;
         }
         return head ;
    }

    private static DLLNode findTail(DLLNode head) {

        while(head.getNext()!=null){
            head= head.getNext();
        }
        return head ;
    }


    public static void main(String[] args) {
        DLLNode head = new DLLNode(1);
        DLLNode node1  = new DLLNode(2);
        DLLNode node2 = new DLLNode(3);
        DLLNode node3 = new DLLNode(4);
        DLLNode node4 = new DLLNode(5);

        head.setNext(node1); node1.setPrev(head);
        node1.setNext(node2); node2.setPrev(node1);
        node2.setNext(node3); node3.setPrev(node2);
        node3.setNext(node4); node4.setPrev(node3);

        traverse(head);
        DLLNode newHead = reverse(head);
        System.out.println();
        traverse(newHead);
    }
}
