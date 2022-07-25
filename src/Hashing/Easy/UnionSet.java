package Hashing.Easy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static void main(String[] args) {
        int[] arr1 = {11,1,3,13,21,7};
        int[] arr2 = {};
        union(arr1,arr2);
    }


    private static void union(int[]arr1,int[]arr2){
        Set<Integer> set = new HashSet<>();
        if(arr1==null && arr2 ==null) System.out.println("Invalid input");
        else if (arr1==null) {
            System.out.println(Arrays.toString(arr2));
        }
        else if(arr2==null){
            System.out.println(Arrays.toString(arr1));
        }
        else{for (int i:arr1) {
            set.add(i);
        }
            for (int j:arr2) {
                set.add(j);
            }
            System.out.println(set);
        }
    }
}
