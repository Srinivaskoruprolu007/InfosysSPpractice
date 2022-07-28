package Sorting;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[]arr = {1,4,2,6,1,6,3};
        freq(arr);
    }


    private static void freq(int[]arr){
        Arrays.sort(arr);
        int i = 0;
        while (i< arr.length){
            int count = 1;

            while(i< arr.length-1 && arr[i]==arr[i+1]){
                i+=1;
                count+=1;
            }
            System.out.println(arr[i]+" : "+count);
            i+=1;
        }
    }
}
//Time complexity = O(n log n)
//Space complexity = O(1)