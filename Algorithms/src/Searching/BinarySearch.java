package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {4,5,7,8,9,22,23};
        int target = 22;
        System.out.println(search(arr,target));
    }


    private static int search(int[]arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                right = mid;
            }
            else left = mid;
        }
        return -1;
    }
}
