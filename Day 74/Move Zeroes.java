class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

    
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            //move all non-zero elements to the front of the array 
            if(nums[i] != 0){
                //avoid uneccessary swaps
               nums[index] = nums[i];
                index++;
            }
       
        }
        //move zeroes to end (this will reduce total no. of operations)
        while(index < nums.length){
            nums[index] = 0;
            index++;

        }
    }
}
