class Solution {
    publitialize the new length to 2 since the first two elements are always allowed.

        for (int r = 2; r < n; r++) {
            if (nums[r] != nums[l - 2]) {
                nums[l] = nums[r];
                l++;
            }
        }

        int k = 2; // Maximu

        return l;c int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n; // If there are 2 or fewer elements, no need to remove duplicates.
        }m number of duplicates allowed.
        int l = 2; // Ini
    }
}
