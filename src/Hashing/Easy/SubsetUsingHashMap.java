package Hashing.Easy;

import java.util.HashMap;

public class SubsetUsingHashMap {
    public static void main(String[] args) {
        int[] arr1 = {11,1,3,13,21,7};
        int[]arr2 = {11,3,7,5};
        System.out.println(isSubset(arr1,arr2) ? "arr2[] is subset of arr1[]":"arr2[] is not subset of arr1[]");
    }
    private static boolean isSubset(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i :arr1) {
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        for (int j=0;j< arr2.length;j++){
            if(hash.getOrDefault(arr2[j],0)>0){
                hash.put(arr2[j],hash.get(arr1[j])-1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
