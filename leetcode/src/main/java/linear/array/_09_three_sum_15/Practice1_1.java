package linear.array._09_three_sum_15;

import java.util.*;

public class Practice1_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum = nums[i];
            while (left < right) {
                if (sum + nums[left] + nums[right] > 0) {
                    right--;
                } else if (sum + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    int lVal = nums[left];
                    int rVal = nums[right];
                    while (left < nums.length && lVal == nums[left]) {
                        left++;
                    }
                    while (right > 0 && rVal == nums[right]) {
                        right--;
                    }
                }
            }

            while (i < nums.length - 1 && sum == nums[i + 1]) {
                i++;
            }
        }

        return result;
    }
    // 28ms
}
