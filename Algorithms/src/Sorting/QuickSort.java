package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {1,4,2,8,3,27,43,6};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int low, int high) {
        if(low<high){
            int indexPI = partition(arr,low,high);

            quickSort(arr,low,indexPI-1);//left partition
            quickSort(arr,indexPI+1,high);//right partition
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int swapIndex = low-1;
        int pivot = arr[high];
        for (int i = low; i < high; i++) {
            if(arr[i]< pivot){
                swapIndex++;
                swap(arr,i,swapIndex);
            }
        }
        swap(arr,swapIndex+1,high);

        return swapIndex+1;
    }

    private static void swap(int[] arr, int i, int swapIndex) {
        int temp = arr[swapIndex];
        arr[swapIndex] = arr[i];
        arr[i] = temp;
    }
}
