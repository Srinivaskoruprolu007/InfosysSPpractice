package Hashing.Easy;

import java.util.HashSet;

public class TargetSum {
    public static void main(String[] args) {
        int[]arr = {1,3,5,6,8};
        int sum = 8;
        checkSum(arr,sum);
    }

    static void checkSum(int[]arr,int sum){
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<arr.length;i++) {
            int temp = sum-arr[i];
            if(set.contains(temp)){
                System.out.println("pair with given sum "+sum+" is ("+arr[i]+" "+temp+")");
            }
            set.add(arr[i]);
        }

    }
}
