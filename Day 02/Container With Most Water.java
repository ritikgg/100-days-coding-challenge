//Solved this using two pointers. TC of O(n).

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int mostWater = 0;
        int left = 0;
        int right = n-1;
        
        while(left < right){

                int width = right - left;
                int midHeight = Math.min(height[left],height[right]);
                int area = midHeight * width;
                
                mostWater = Math.max(mostWater,area);
                
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return mostWater;
        
    }
}
