package dynamicprogramming._279;

public class Practice3 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++){
            dp[i] = i;
        }

        for(int i=1; i<=n; i++){
            for(int j=i*i; j<=n; j++){
                dp[j]= Math.min(dp[j], dp[j-i*i]+1);

            }
        }

        return dp[n];
    }
    // 26ms
}
