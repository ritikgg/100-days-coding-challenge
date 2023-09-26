import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        int maxLength = 0;
        int sum = 0;

        
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        
            if (sumMap.containsKey(sum)) {
                int startIndex = sumMap.get(sum);
                maxLength = Math.max(maxLength, i - startIndex);
            } else {
                sumMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
