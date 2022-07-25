package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n = -1;
        System.out.println(sumOfN(n));
    }

    private static int sumOfN(int n){
        if(n<=0) return n;
        else return n+sumOfN(n-1);
    }
}
