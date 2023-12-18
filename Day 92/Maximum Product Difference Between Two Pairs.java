// most concise code but Tc - O(nlogn)
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int ans = (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]);
        return ans;
    }
}

// better TC - O(n)
class Solution {
    public int maxProductDifference(int[] nums) {
        int firstLargest = 0, secondLargest = 0;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = n;
            } else if (n < secondSmallest) {
                secondSmallest = n;
            }

            if (n > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = n;
            } else if (n > secondLargest) {
                secondLargest = n;
            }
        }

        return firstLargest * secondLargest - firstSmallest * secondSmallest;        
    }
}
