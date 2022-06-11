package stacks;

import java.util.Stack;

public class June112022 {


    public static void main(String[] args) {

        String exp = "+7*29";

        System.out.println(evaluatePrefix(exp));
    }

    private static double evaluatePrefix(String exp) {

        Stack<Double> stack = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--){

            char c = exp.charAt(i);

            if(isOperand(c)){
                stack.push( (double)(c-48));
            }else{
                double  op1 = stack.pop();
                double op2 = stack.pop();

                switch(c){
                    case '+' :
                        stack.push(op1+op2);
                        break;
                    case '-' :
                        stack.push(op1-op2);
                        break;
                    case '*' :
                        stack.push(op1*op2);
                        break;
                    case '/' :
                        stack.push(op1/op2);
                        break;
                }
            }
        }
        return stack.peek();
    }

    private static boolean isOperand(char c) {

        return c>=48 && c <=57;
    }
}
