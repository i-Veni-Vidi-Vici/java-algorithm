package dynamicprogramming._1884;

public class Solution1 {
    public int twoEggDrop(int n) {
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int attempts = Math.max(j - 1, dp[i - j]);
                dp[i] = Math.min(dp[i], attempts + 1);
            }
        }

        return dp[n];
    }
    // 17ms
}
