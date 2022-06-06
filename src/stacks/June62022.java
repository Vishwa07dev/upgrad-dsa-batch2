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



        char[] arr = { '(', '[','{','}',']',')'};
        System.out.println(isBalanced(arr));
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

    public static boolean isBalanced(char[] ac) {

        Stack<Character> s = new Stack();

        for (int i = 0; i < ac.length; i++) {
            if (ac[i] == '{' || ac[i] == '(' || ac[i] == '[') {
                s.push(ac[i]);

            } else if (ac[i] == '}' || ac[i] == ')' || ac[i] == ']') {

                /**
                 * Check if it's matching with the previous bracket
                 * and also this is not the first bracket
                 */
                if(s.isEmpty()){
                    return false ;
                }

                if(!isMatching(s.peek(), ac[i])){
                    return false;
                }
                s.pop();

            }
        }
        if (s.size() > 0) {
            return false;
        }
        return true;
    }

    private static boolean isMatching(Character open, char close) {
        if ((open =='(' && close==')') ||
                (open =='{' && close=='}') ||
                (open =='[' && close==']')){
            return true;
        }else{
            return false ;
        }
    }
}
