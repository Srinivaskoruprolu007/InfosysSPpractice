package Recursion;

public class FirstOccurance {
    public static void main(String[] args) {
        int[]arr = {1,4,5,3,4};
        int val = 4;
        firstOccur(arr, arr.length-1, val,0);
    }
    private static void firstOccur(int[] arr,int size,int value,int start){
        if(size==start){
            return;
        }
        if(arr[start]==value) {
            System.out.println(arr[start]);
            start =size;
        } else {
        firstOccur(arr,size,value,++start);}
    }
}
