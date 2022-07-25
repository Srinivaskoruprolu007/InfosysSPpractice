package Recursion;

public class TribnocciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribnocci(n));
    }

    private static int tribnocci(int n){
        if(n<=1) return n;
        if(n==2) return 1;
        else return tribnocci(n-1)+tribnocci(n-2)+tribnocci(n-3);
    }
}
