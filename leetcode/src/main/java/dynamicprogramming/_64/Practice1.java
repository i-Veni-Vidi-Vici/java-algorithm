package dynamicprogramming._64;

public class Practice1 {
    public int minPathSum(int[][] grid) {
        int[][] dp= new int[grid.length][grid[0].length];


        dp[0][0]= grid[0][0];
        for(int i=1; i<grid.length; i++){
            dp[i][0]= grid[i][0]+ dp[i-1][0];
        }
        for(int i=1; i<grid[0].length; i++){
            dp[0][i]= grid[0][i]+ dp[0][i-1];
        }

        for(int x=1; x<grid.length; x++){
            for(int y=1; y<grid[0].length; y++){
                dp[x][y]= Math.min(dp[x-1][y], dp[x][y-1])+ grid[x][y];
            }
        }

        return dp[grid.length-1][grid[0].length-1];
    }
    // 4ms
}
