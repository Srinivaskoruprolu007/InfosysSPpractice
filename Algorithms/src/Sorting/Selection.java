package Sorting;

import java.util.Arrays;

public  class Selection {

    public static void main(String[] args) {
        int[] arr = {72,50,10,44,8,20};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++){

            int minIndex = i;
            for (int j = i + 1; j < n ; j++) {
                 if (arr[j] < arr[minIndex] )
                     minIndex = j;

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}