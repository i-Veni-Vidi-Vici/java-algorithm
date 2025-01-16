package dynamicprogramming._368;

import java.util.*;

public class Practice1 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 1) {
            return List.of(nums[0]);
        }

        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != 1 && nums[j] % nums[i] == 0) {
                    dp[i] += 1;
                }
            }
            if (dp[i] > max) {
                max = dp[i];
                index = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (nums[0] == 1) {
            result.add(1);
            if (index == 0) {
                if (nums.length > 1) {
                    result.add(nums[1]);
                    return result;
                }
            }
        }

        int findNum = nums[index];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % findNum == 0) {
                result.add(nums[i]);
            }

        }

        return result;
    }
    // error
}
