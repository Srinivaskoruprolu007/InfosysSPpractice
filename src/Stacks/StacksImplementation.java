package Stacks;



public class StacksImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        System.out.println(stack);
    }
}
class Stack{
    static final int MAX = 10;
    int top;
    int[] a = new int[MAX];//Maximum size of stack
    Stack(){
        top = -1;
    }
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x+" Pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }else {
            return a[top--];
        }
    }
    int peek(){
        if(top < 0){
            System.out.println("Stock Underflow");
            return Integer.MIN_VALUE;
        }
        else{
            return a[top];
        }
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top == MAX+1;
    }
}
