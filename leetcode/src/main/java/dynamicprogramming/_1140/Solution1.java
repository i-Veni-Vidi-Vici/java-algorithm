package dynamicprogramming._1140;

public class Solution1 {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = piles[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + piles[i];
        }

        int[][] dp = new int[n][n+1];

        return solve(0, 1, dp, suffixSum);
    }

    private int solve(int index, int M, int[][] dp, int[] suffixSum) {
        if (index >= suffixSum.length) return 0;
        if (dp[index][M] != 0) return dp[index][M];
        if (index + 2*M >= suffixSum.length) {
            return suffixSum[index];
        }

        int result = 0;

        for (int X = 1; X <= 2*M; X++) {
            if (index + X > suffixSum.length) break;
            int current = suffixSum[index] - suffixSum[index + X];
            int opponent = solve(index + X, Math.max(M, X), dp, suffixSum);
            result = Math.max(result, current + (suffixSum[index + X] - opponent));
        }

        dp[index][M] = result;
        return result;
    }
    // 3ms
}
