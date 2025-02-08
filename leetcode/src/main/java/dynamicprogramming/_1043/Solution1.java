package dynamicprogramming._1043;

public class Solution1 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];

        // 첫 번째 k개 원소 초기화
        int max = 0;
        for (int i = 0; i < Math.min(k, n); i++) {
            max = Math.max(max, arr[i]);
            dp[i] = max * (i + 1);
        }

        // 나머지 위치에 대해 계산
        for (int i = k; i < n; i++) {
            max = 0;
            for (int j = 1; j <= k; j++) {
                // 현재 위치에서 j개 이전까지의 최대값 찾기
                max = Math.max(max, arr[i - j + 1]);
                dp[i] = Math.max(dp[i], dp[i - j] + max * j);
            }
        }

        return dp[n - 1];
    }
    // 4ms
}
