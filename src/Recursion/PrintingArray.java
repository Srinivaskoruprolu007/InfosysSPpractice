package Recursion;

public class PrintingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};
        printArray(arr, arr.length,0 );
    }

    private static void printArray(int[]arr,int size,int start){
        if(start==size) {
            return;
        }
        System.out.print(arr[start]+" ");
        printArray(arr,size,++start);
    }
}
