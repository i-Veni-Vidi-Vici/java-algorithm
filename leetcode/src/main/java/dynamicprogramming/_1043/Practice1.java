package dynamicprogramming._1043;

public class Practice1 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maxInPartition = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maxInPartition = Math.max(maxInPartition, arr[i - j]);
                dp[i] = Math.max(dp[i], dp[i - j] + maxInPartition * j);
            }
        }

        return dp[n];
    }

    // 6ms
}
