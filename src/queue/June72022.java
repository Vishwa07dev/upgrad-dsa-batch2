package queue;

import ll.ListNode;

import javax.swing.*;

public class June72022 {
}


class QueueUsingArray {


    private int front; // enQueue
    private int rear ;  // deQueue
    private int capacity;
    private int[] arr ;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        front = -1;
        rear = -1;

    }

    public boolean isEmpty(){
        return front == -1 && rear ==-1;
    }

    public boolean isFull() {
        return (front+1)%capacity == rear ;  // ???? Are you clear on this
    }

    public void enQueue(int data){
        if(isFull()){
            throw new RuntimeException("Queue overflow exception");
        }
        front = (front+1)%this.capacity;
        this.arr[front] = data ;
        if(rear == -1){
            rear = front;
        }
    }

    public int deQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue underflow exception");
        }
        int data = arr[rear];

        /**
         * If there is only single element
         */
        if(rear == front){
            rear = -1;
            front = -1;
        }else{
            rear = (rear+1)%this.capacity;
        }
        return data ;
    }
}




class QueueUsingLinkedList {

    private ListNode frontNode ; // enQueue
    private ListNode rearNode ;  //deQueue

    public boolean isEmpty(){
        return frontNode==null && rearNode==null;
    }

    public void enQueue(int data){
        //It should happen at frontNode
        if(isEmpty()){
            frontNode = new ListNode(data);
            rearNode = frontNode;
        }else{
            frontNode.setNext(new ListNode(data));
            frontNode= frontNode.getNext();
        }
    }

    public int deQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue underflow exception");
        }
        int data = rearNode.getData();
        rearNode = rearNode.getNext();
        return data;
    }
}
