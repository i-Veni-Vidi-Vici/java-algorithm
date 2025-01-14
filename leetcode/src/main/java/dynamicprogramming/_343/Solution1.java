package dynamicprogramming._343;

public class Solution1 {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++) {
            dp[i] = i;
            for (int j = 2; j <= i/2; j++) {
                int product = dp[j] * dp[i-j];
                dp[i] = Math.max(dp[i], product);
            }
        }

        return dp[n];
    }
    // 0ms
}
