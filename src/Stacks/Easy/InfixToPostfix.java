package Stacks.Easy;

import java.util.Stack;

public class InfixToPostfix {

//    A method for return the precedence of a given operator
    private static int prec(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
    private static String infixToPostfix(String exp){
        String str = new String("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <exp.length() ; i++) {
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                str += String.valueOf( c);
            } else if (c=='(') {
                stack.push(c);
            } else if (c==')') {
                while (!stack.isEmpty() && stack.peek()!='('){
                    str += stack.pop();
                }
                stack.pop();
                }
            else {
                while (!stack.isEmpty()&&prec(c)<=prec(stack.peek())){
                    str += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            if(stack.peek()=='('){
                return new String("Invalid Expression");
            }
            str += stack.pop();
        }
        return str;
    }

    public static void main(String[] args) {
        String exp =  "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
