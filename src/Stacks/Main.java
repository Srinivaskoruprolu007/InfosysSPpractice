package Stacks;

import java.util.Stack;

//Implementation of Stacks
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);//Its get printed
//        let's Access them
        System.out.println(stack.pop());//it returns the last pushed value into the stack
        
    }
}
