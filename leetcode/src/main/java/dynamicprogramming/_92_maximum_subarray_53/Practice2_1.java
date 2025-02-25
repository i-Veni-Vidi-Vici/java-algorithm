package dynamicprogramming._92_maximum_subarray_53;

public class Practice2_1 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
    // 1ms
}
