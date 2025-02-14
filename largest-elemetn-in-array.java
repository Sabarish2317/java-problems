import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[arr.length-2];


        // //sol 2
        int maxn = arr[0];
        for(int i=1; i<n; i++){
            maxn = Math.max(maxn,arr[i]);
        }
        return maxn;
    }
}
