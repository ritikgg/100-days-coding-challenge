import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 class threeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> triplets = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                } else if (sum > 0) {
                    k--;
                }
                else {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    triplets.add(new ArrayList<>(temp));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k--;
                }
            }
        }

        return triplets;
    }
}
