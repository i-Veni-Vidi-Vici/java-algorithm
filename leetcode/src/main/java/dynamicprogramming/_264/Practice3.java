package dynamicprogramming._264;

public class Practice3 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int two = 0;
        int three = 0;
        int five = 0;

        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[two] * 2, Math.min(dp[three] * 3, dp[five] * 5));
            dp[i] = min;
            if (min == dp[two] * 2) {
                two++;
            }
            if (min == dp[three] * 3) {
                three++;
            }
            if (min == dp[five] * 5) {
                five++;
            }
        }

        return dp[n - 1];
    }
    // 2ms
}
