import java.awt.SecondaryLoop;

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        if(n==0 || n==1){
            return new int[]{-1, -1};
        }
        int small = Integer.MAX_VALUE;
        int small2nd = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int large2nd = Integer.MIN_VALUE;

        int i;
        for(i=0;i<n;i++){
            small = Math.min(small, a[i]);
            large = Math.max(large,a[i]);
        }

        for(i = 0;i < n;i++){
            if(a[i] < small2nd && a[i] != small){
                small2nd = a[i];
            }
            if(a[i] > large2nd && a[i] != large){
                large2nd = a[i];
            }
        }
        return new int[]{large2nd, small2nd};
    }
}
