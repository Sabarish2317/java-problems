import java.util.Arrays;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = -1;
        int s_max = -1;
        int min = Integer. MAX_VALUE;
        int s_min = Integer. MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i] > max){
                s_max = max;
                max = a[i];
            }else if(a[i] > s_max && a[i] < max){
                s_max = a[i];
            }

            if(a[i] < min){
                s_min = min;
                min = a[i];
            }else if (a[i] < s_min && a[i] > min) {
                s_min = a[i];
            }
        }

        return new int[]{s_max,s_min};
    }
}
