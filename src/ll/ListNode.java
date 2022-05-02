package ll;

public class ListNode {

    private int data ;
    /**
     * What is my next node
     */
    private ListNode next ; // Compositions  // default value is null

    public ListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                '}';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
