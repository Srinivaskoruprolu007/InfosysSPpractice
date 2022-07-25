package Hashing.Easy;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr = {1,3,2,4,2,1,5};
        remove(arr);
    }
    static void remove(int[]arr){
        HashSet<Integer>hash = new HashSet<>();
        for (int i:arr) {
            hash.add(i);
        }
        System.out.println(hash);
    }
}
