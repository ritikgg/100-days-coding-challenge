class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] answer = new int[n]; 

        leftProduct[0] = 1;
        for(int i=1;i<n;i++){
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        
        rightProduct[n-1] = 1;
        for(int j =n-2;j>=0;j--){
            rightProduct[j] = rightProduct[j+1]*nums[j+1];
        }
        for(int k=0;k<n;k++){
            answer[k] = leftProduct[k]*rightProduct[k];
        }
        
        return answer;
    }
}

