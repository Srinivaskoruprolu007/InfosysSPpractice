package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,6,7,8};
        int target = 6;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    private static int search(int[] arr, int target,int left, int right) {
        if(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) return search(arr,target,left,mid);
            else return search(arr,target,mid,right);
        }
        return -1;
    }
}
