package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,66,7};
        int target = 66;
        System.out.println(search(arr,target));
    }

    private static int search(int[]arr, int target){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
