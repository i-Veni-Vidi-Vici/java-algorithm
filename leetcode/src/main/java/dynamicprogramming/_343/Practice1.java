package dynamicprogramming._343;

public class Practice1 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2]= 1;

        for(int i=3; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] = Math.max(dp[i], Math.max(dp[i-j]*j, j*(i-j)));
            }
        }

        return dp[n];
    }
    // 7ms
}
