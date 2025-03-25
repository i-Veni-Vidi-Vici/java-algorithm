package dynamicprogramming._322;

public class Practice2_2 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        for(int i=0; i<dp.length; i++){
            dp[i] = amount +1;
        }
        dp[0] = 0;

        for(int i=1; i<dp.length; i++){
            for(int coin : coins){
                if(i>= coin)
                    dp[i] = Math.min(dp[i], dp[i- coin]+1);
            }
        }

        return dp[amount] != amount+1 ? dp[amount] : -1;
    }
    // 14ms
}
