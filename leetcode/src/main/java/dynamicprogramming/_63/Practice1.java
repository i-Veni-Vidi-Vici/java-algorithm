package dynamicprogramming._63;

public class Practice1 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int x = 1; x < obstacleGrid.length; x++) {
            for (int y = 1; y < obstacleGrid[0].length; y++) {
                dp[x][y] = obstacleGrid[x][y] != 1 ? dp[x - 1][y] + dp[x][y - 1] : 0;
            }
        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
    // 0ms
}
