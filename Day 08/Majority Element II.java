class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3;
        
        // Use a HashMap to count occurrences of each element
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        // Check each element if it appears more than n/3 times
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}
