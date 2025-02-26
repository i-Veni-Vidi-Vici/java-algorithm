package dynamicprogramming._93_climbing_stairs_70;

public class Practice70_1 {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]= 1;
        dp[1]= 1;

        for(int i=2; i<dp.length; i++){
            dp[i]= dp[i-1]+ dp[i-2];
        }

        return dp[n];
    }
    // 0ms
}
