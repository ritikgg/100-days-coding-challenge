//simplest approach using sorting

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}

//Brute force approach

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       for(int i = 0;i<n;i++){
           int count = 0;
           for(int j = 0;j<n;j++){
               if(nums[i]==nums[j]){
                   count++;
               }
           }
           if(count>n/2)
           return nums[i];
       }
       return -1;
    }
}


//Optimal approach using Moore's Voting Algorithm


class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for(int i = 0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            }
            else if(el == nums[i]) cnt++;
            else cnt--;
        }
        int cnt1 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == el) cnt1++;
        }
        if(cnt1 > (n/2)) return el;
        return -1;
    }
}
