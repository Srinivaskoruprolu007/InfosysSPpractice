package Recursion;
//Let's solve by using recursion
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getFactorial(n));
    }

    private static int getFactorial(int n) {
        int fact;
        if (n > 0) {
            fact = n * getFactorial(n - 1);
            return fact;
        }
        else return 1;
    }

}
