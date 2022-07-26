package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,0};
        int val = 1;
        lastOccur(arr,arr.length-1,0,1);


    }
    private static void lastOccur(int[]arr,int size,int start,int val){
        if (start==size) return;

        if(arr[size]==val){
            System.out.print(arr[start]);
            start = size;
        }
        else lastOccur(arr, --size, start, val);
    }
}
