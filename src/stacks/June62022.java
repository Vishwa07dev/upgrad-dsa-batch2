package stacks;

import java.util.Stack;

public class June62022 {


    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(3);
        s.push(11);
        s.push(15);

        System.out.println(s);


        reverseStack(s);

        System.out.println(s); // [15,11,3,5]
    }


    private static void reverseStack(Stack<Integer> s) {
        /**
         * Base condition
         */
        if (s == null || s.isEmpty()) {
            return;
        }

        int data = s.pop();
        reverseStack(s);
        insertAtTheBotton(s, data); // This will be call multiple times
    }

    private static void insertAtTheBotton(Stack<Integer> s, int data) {

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int element = s.pop();
        insertAtTheBotton(s, data);
        s.push(element);
    }
}
