class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1}; // Initialize with -1 values in case target is not found

        if (nums == null || nums.length == 0) {
            return result; // Empty array, return {-1, -1}
        }

        // Search for the first occurrence of the target
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] != target) {
            return result; // Target not found, return {-1, -1}
        }

        result[0] = left; // Store the index of the first occurrence

        // Search for the last occurrence of the target
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2; // Make mid biased to the right
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        result[1] = left; // Store the index of the last occurrence
        return result;
    }
}
