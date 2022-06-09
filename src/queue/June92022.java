package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class June92022 {

}

class StackUsingQueue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){
        /**
         * Q1  -> Q2
         */
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        /**
         * Insert the data in Q1
         */
        q1.add(data);

        /**
         * Insert the data from Q2 to Q1
         */
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }

    public int pop(){
        if(q1.isEmpty()){
            throw new RuntimeException("Stack underflow exception");
        }
        int data = q1.remove();
        return data;
    }
}

class QueueUsingStack {


    private Stack<Integer> stack1 = new Stack<>();

    /**
     * This internal java stack can take any size
     */
    private Stack<Integer> stack2 = new Stack<>();


    public void enQueue(int data){

        while(!stack1.isEmpty()){
            //move all the elements from stack1 to stack2
            stack2.push(stack1.pop());
        }

        stack1.push(data);

        /**
         * Push back all the elements from s2 to s1
         */
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int deQueue(){
        if(stack1.isEmpty()){
            throw new RuntimeException("Queue underflow exception");
        }
        return stack1.pop();
    }
}
