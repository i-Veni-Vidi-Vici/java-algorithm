package dynamicprogramming._474;

public class Practice2_1 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int max =0;

        for (String str : strs) {
            int one = 0;
            int zero = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else if (c == '1') {
                    one++;
                }
            }

            for (int i = m; i >= 0; i--) {
                for (int j = n; j >= 0; j--) {
                    if (i >= zero && j >= one) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
                        max = Math.max(dp[i][j], max);
                    }

                }
            }
        }

        return max;
    }

    // 32ms
}
