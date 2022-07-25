package Hashing.Easy;

public class SubSetOrNot {
    public static void main(String[] args) {
        int[] arr1 = {11,1,3,13,21,7};
        int[]arr2 = {11,3,7,1};
        System.out.println(isSubset(arr1,arr2) ? "arr2[] is subset of arr1[]":"arr2[] is not subset of arr1[]");
    }

    static boolean isSubset(int[]arr1,int[]arr2){
        if(arr1==null || arr2==null){
            return false;
        }
        int m = arr1.length;
        int n = arr2.length;
        if(m<n){
            return false;
        }
        int j =0;
        int i =0;
        for ( i =0;i<n;i++) {
            for( j =0;j<m;j++){
                if(arr2[i]==arr2[j]){
                    break;
                }
            }
            if(j==m) return false;

        }
        return true;
    }
}
