class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        int mergedIndex = m + n - 1; // Index for the merged array

        while (left >= 0 && right >= 0) {
            if (nums1[left] > nums2[right]) {
                nums1[mergedIndex--] = nums1[left--];
            } else {
                nums1[mergedIndex--] = nums2[right--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (right >= 0) {
            nums1[mergedIndex--] = nums2[right--];
        }

        // At this point, nums1 contains the merged and sorted array
        Arrays.sort(nums1);
    }
}
