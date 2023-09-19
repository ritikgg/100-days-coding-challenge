class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<nums.length;i++){
            currSum = Math.max(currSum + nums[i],nums[i]);
            maxSum = Math.max(maxSum,currSum);

        }
        return maxSum;
    }
}

// By DP
class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxSum = dp[0];

        for(int i = 1;i<n;i++){
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
            maxSum = Math.max(maxSum,dp[i]);
        }
        return maxSum;
    }
}
    
