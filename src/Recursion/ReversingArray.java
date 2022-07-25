package Recursion;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[]arr = {1,3,24,2,21};
        int start = 0;
        int end = arr.length-1;
        reverse(arr,start,end);
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr,int start, int end){
        if (start>end){
            return;
        }
        swap(arr,start,end);
        reverse(arr,start+1,end-1);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
//    Without recursion
    private static void reverseArr(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
