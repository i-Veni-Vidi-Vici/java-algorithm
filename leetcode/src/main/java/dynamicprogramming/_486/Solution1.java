package dynamicprogramming._486;

public class Solution1 {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n][n];

        return maxDiff(nums, 0, n-1, dp) >= 0;
    }

    private int maxDiff(int[] nums, int left, int right, Integer[][] dp) {
        if (left == right) {
            return nums[left];
        }

        if (dp[left][right] != null) {
            return dp[left][right];
        }

        int leftChoice = nums[left] - maxDiff(nums, left+1, right, dp);
        int rightChoice = nums[right] - maxDiff(nums, left, right-1, dp);

        dp[left][right] = Math.max(leftChoice, rightChoice);
        return dp[left][right];
    }
    // 0ms
}
