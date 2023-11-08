import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums.length == 0) {
            return result; // Handle the case where the input array is empty.
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i]; // Expand the range.
            } else {
                if (start == end) {
                    result.add(Integer.toString(start));
                } else {
                    result.add(start + "->" + end);
                }
                start = end = nums[i]; // Start a new range.
            }
        }
        
        // Add the last range.
        if (start == end) {
            result.add(Integer.toString(start));
        } else {
            result.add(start + "->" + end);
        }
        
        return result;
    }
}
