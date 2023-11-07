class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0) return 0;

        HashSet<Integer> numberSet = new HashSet<>();
        for(int num : nums) numberSet.add(num);

        int longest = 0;

        for(int num : numberSet){
            if(!numberSet.contains(num - 1)){
                int current = num;
            while (numberSet.contains(current + 1)) current++;
            longest = Math.max(longest, current - num + 1);

            }
           
        }
        return longest;
    }
}
