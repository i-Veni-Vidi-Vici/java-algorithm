package dynamicprogramming._416;

public class Solution2 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        // 전체 합이 홀수면 두 부분으로 나눌 수 없음
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // 0을 만드는 건 가능 (부분집합 없이)

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }
    // 30ms
}
