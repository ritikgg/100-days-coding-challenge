class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Populate sets with unique elements
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        int count1 = 0;
        int count2 = 0;

        // Count occurrences in nums2 using set1
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }

        // Count occurrences in nums1 using set2
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }

        int[] ans = {count1, count2};
        return ans;
    }
}
