package ll;

public class ListNodeWithRandom {

    private int data ;
    private ListNodeWithRandom next ;
    private ListNodeWithRandom random ;

    public ListNodeWithRandom(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNodeWithRandom getNext() {
        return next;
    }

    public void setNext(ListNodeWithRandom next) {
        this.next = next;
    }

    public ListNodeWithRandom getRandom() {
        return random;
    }

    public void setRandom(ListNodeWithRandom random) {
        this.random = random;
    }
}
