package dynamicprogramming._486;

public class Practice2 {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n][n];

        return score(nums, 0, n - 1, memo) >= 0;
    }

    private int score(int[] nums, int i, int j, Integer[][] memo) {
        if (i == j) return nums[i];
        if (memo[i][j] != null) return memo[i][j];

        int pickLeft = nums[i] - score(nums, i + 1, j, memo);
        int pickRight = nums[j] - score(nums, i, j - 1, memo);

        memo[i][j] = Math.max(pickLeft, pickRight);
        return memo[i][j];
    }

    // 0ms
}
