class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++; 
                max = Math.max(max,count); // find max of count ones
            }
            else{
                count = 0;// reset count
                
            }
        }
        return max;
    }
}
