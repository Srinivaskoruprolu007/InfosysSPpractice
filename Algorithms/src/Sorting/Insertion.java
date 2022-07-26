package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int []arr = {3,2,5,67,2,8,7,6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[]arr){
        int i, j;
        for (i = 0; i<arr.length; i++) {
            int temp = arr[i];
            j = i;
            while (j>0 && arr[j-1]>=temp){
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }

        }
    }
}
