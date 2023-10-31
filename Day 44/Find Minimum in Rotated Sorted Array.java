// Brute force TC is O(n)

class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
      
        if(nums.length == 1){
                return nums[0];
            }
      
      for(int i = 0;i<nums.length;i++){
        min = Math.min(min,nums[i]);
        }
        return min;
    }
}

//More optimized TC is O(n) but it return min as soon as it finds

class Solution {
    public int findMin(int[] nums) {
      
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1])
            {
                return nums[i+1];// As soon as it finds a value greater than the next element, it returns the next element as the minimum
            }
        }
      
        return nums[0]; // if minimun is not found in loop than the first element of the array is minimun.
    }
}

//Optimal approach. Using binary search TC is O(log n)

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                // The minimum element is on the right side
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // The minimum element is on the left side, or mid itself
                right = mid;
            } else {
                // When nums[mid] is equal to nums[right], we can't decide which side to go,
                // so just decrement right to reduce the search space.
                right--;
            }
        }
        
        return nums[left];
    }
}
