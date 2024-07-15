package linear.array._07_two_sum_1;

import java.util.Arrays;

public class Practice1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    // 45ms
}
