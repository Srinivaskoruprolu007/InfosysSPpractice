package Recursion;

public class FibnocciSeries {
    public static void main(String[] args) {
        int n = 8;
        printFib(n);

    }

    private static int fib(int n){
        if(n<=1){
            return n;
        }
        else return fib(n-1)+fib(n-2);
    }
    private static void printFib(int n){
        for (int i =0;i<n;i++) {
            System.out.println(fib(i)+" ");
        }
    }
}
