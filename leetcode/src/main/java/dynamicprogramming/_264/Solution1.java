package dynamicprogramming._264;

public class Solution1 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;


        for (int i = 1; i < n; i++) {
            int next2 = dp[p2] * 2;
            int next3 = dp[p3] * 3;
            int next5 = dp[p5] * 5;

            int min = Math.min(next2, Math.min(next3, next5));
            dp[i] = min;

            if (min == next2) p2++;
            if (min == next3) p3++;
            if (min == next5) p5++;
        }

        return dp[n-1];
    }
    // 2ms
}
