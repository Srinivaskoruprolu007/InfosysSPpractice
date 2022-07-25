package Recursion;

public class Power {
    public static void main(String[] args) {
        int base = 5;
        int power = 3;
        System.out.println(power(base,power));
    }
    private static int power(int n,int x){
        if(x!=0) {
            int power = n*power(n,x-1);
            return power;
        }
        else return 1;
    }

}
