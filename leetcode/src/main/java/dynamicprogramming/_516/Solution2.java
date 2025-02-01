package dynamicprogramming._516;

public class Solution2 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[] prev = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1;
            int temp = 0;
            for (int j = i + 1; j < n; j++) {
                int saved = dp[j];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = temp + 2;
                } else {
                    dp[j] = Math.max(dp[j], dp[j-1]);
                }
                temp = saved;
            }
        }

        return dp[n-1];
    }
    // 25ms
}
