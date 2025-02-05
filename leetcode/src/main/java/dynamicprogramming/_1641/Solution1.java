package dynamicprogramming._1641;

public class Solution1 {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][5];

        for (int j = 0; j < 5; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
            dp[i][2] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2];
            dp[i][3] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3];
            dp[i][4] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4];
        }

        int result = 0;
        for (int j = 0; j < 5; j++) {
            result += dp[n][j];
        }
        return result;
    }
    // 0ms
}
