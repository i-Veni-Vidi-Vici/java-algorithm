package dynamicprogramming._1277;

public class Solution1 {
    public int countSquares(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int count = 0;

        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
            count += dp[0][j];
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = matrix[i][0];
            count += dp[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(
                            Math.min(dp[i-1][j], dp[i][j-1]),
                            dp[i-1][j-1]
                    ) + 1;
                    count += dp[i][j];
                }
            }
        }

        return count;
    }
    // 6ms
}
