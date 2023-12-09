//Brute force
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    // nums[i] has a duplicate, not a single number
                    isSingle = false;
                    break; //breaks jth loop
                }
            }

            if (isSingle) {
                return nums[i];
            }
        }

        return -1; // No single number found
    }
}


//Optimal Using Bit Manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
}
