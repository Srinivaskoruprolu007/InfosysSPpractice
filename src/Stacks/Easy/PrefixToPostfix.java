package Stacks.Easy;

import java.util.Stack;

public class PrefixToPostfix {
    static boolean isOperator(char c){
        return switch (c) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }
    static String convert(String str){
        Stack<String> stack = new Stack<>();
        for (int i = str.length()-1; i>=0 ; i--) {
            char c = str.charAt(i);
            if(!isOperator(c)){
                stack.push(String.valueOf(c));
            }
            if(isOperator(str.charAt(i))){
                String op1 = String.valueOf(stack.pop());
                String op2 = String.valueOf(stack.pop());
                String temp = op1+op2+c;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println(convert(pre_exp));
    }
}