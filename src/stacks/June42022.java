package stacks;

import ll.ListNode;

import javax.swing.*;

public class June42022 {
}

class StackUsingArray {

    private int[] arr ;  // this will hold data
    private int capacity ; // total capacity of the Stack
    private int top; // this will represent the index of last element added

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        top = -1 ;// initially there is no element

    }

    /**
     * PUSH
     */
    public void push(int data) {
        /**
         * If it's already full
         */
        if(isFull()){
            throw new RuntimeException("Stack overflow exception");
        }
        this.arr[++top] = data;
    }

    /**
     * POP
     */
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow exception");
        }
        return this.arr[this.top--];
    }

    /**
     * isEmpty
     */
    public boolean isEmpty(){
        return this.top == -1  ;
    }

    /**
     * isFull
     */
    public boolean isFull(){
      return this.top == this.capacity-1;
    }

    /**
     * top
     */
    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow exception");
        }
        return arr[this.top]; // just returning the value
    }


}

class StackUsingLL {

    private ListNode head ;

    public boolean isEmpty(){
        return this.head ==null;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
    }

    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack underflow exception");
        }
        /**
         * PUSH and POP both should happen from the head
         */
        int data = head.getData();
        head = head.getNext();
        return data ;
    }

    /**
     * This will just return the last element added
     */
    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow exception");
        }

        return head.getData();
    }

}
