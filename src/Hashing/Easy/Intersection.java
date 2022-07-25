package Hashing.Easy;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[]arr = {1,3,5,6};
        int[]arr1 = {4,5,6,7};
        intersect(arr,arr1);
    }

    private static void intersect(int[]arr,int[]arr1){
        Set<Integer> set = new HashSet<>();
        for (int i:arr) {
            set.add(i);
        }
        for (int j: arr1) {
            if(set.contains(j)){
                set.add(j);
            }
        }
        System.out.println(set);
    }

}
