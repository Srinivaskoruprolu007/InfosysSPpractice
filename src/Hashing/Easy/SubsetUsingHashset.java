package Hashing.Easy;

import java.util.HashSet;

public class SubsetUsingHashset {
    public static void main(String[] args) {
        int[] arr1 = {11,1,3,13,21,7};
        int[]arr2 = {11,3,7,1};
        System.out.println(isSubset(arr1,arr2) ? "arr2[] is subset of arr1[]":"arr2[] is not subset of arr1[]");
    }
    private static boolean isSubset(int[]arr1,int[]arr2){
        if(arr1==null || arr2==null) return false;
        HashSet<Integer>hash =new HashSet<>();
        for (int k : arr1) {
            hash.add(k);
        }
        for (int j : arr2) {
            if (!hash.contains(j)) return false;
        }
        return true;
    }
}
