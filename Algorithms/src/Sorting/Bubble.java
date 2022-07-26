package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[]arr = {1,4,3,5,3,5,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[]arr){
        for (int i =arr.length-1; i>0; i--) {
            for (int j =0; j <i; j++) {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
