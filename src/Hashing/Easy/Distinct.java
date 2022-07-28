package Hashing.Easy;

import java.util.HashSet;

public class Distinct {


    static int countDistinct(int[]arr, int size){
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = i+1; j < size; j++) {
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {5,8,5,7,8};
        System.out.println(countDistinct(arr,arr.length));
        System.out.println(count(arr));
    }
    //using hashSet
    static int count(int[]arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i:arr) {
            set.add(i);
        }
        return set.size();
    }
}
