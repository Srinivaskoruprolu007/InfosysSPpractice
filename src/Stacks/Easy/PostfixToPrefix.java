package Stacks.Easy;

import java.util.Stack;

public class PostfixToPrefix {
    static boolean isOperator(char c){
        return switch (c) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }
    private static String convert(String str){
        Stack <String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(isOperator(c)){
                String op1 = String.valueOf(stack.pop());
                String op2 = String.valueOf(stack.pop());
                String temp = c + op2 + op1;
                stack.push(temp);
            }
            if(!isOperator(c)){
                stack.push(String.valueOf(c));
            }
        }
        String s = new String("");
        for (String i:stack) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
        System.out.println(convert(exp));
    }
}
