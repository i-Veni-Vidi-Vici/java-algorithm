package dynamicprogramming.n_th_tribonacci_number_1137;

public class Practice1 {
    public int tribonacci(int n) {
        int[] dp = new int[38];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        if(n<=2){
            return dp[n];
        }
        for(int i=3; i<=n; i++){
            dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];
    }
    // 0ms
}
