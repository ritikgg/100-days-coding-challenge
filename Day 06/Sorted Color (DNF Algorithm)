import java.util.Arrays;

public class sort_colors {
        public static void sortColors(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int current = 0;

            while (current <= right) {
                if (nums[current] == 0) {
                    swap(nums, left, current);
                    left++;
                    current++;
                } else if (nums[current] == 2) {
                    swap(nums, right, current);
                    right--;

                } else {
                    current++;
                }
            }
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}


