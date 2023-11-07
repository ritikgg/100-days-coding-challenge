class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> index = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(index.containsKey(num) && i - index.get(num) <= k){
                    return true;
                }
            index.put(num, i);   
            
        }
        return false;
    }
}
