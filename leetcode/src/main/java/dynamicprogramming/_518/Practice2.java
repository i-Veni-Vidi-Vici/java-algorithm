package dynamicprogramming._518;

public class Practice2 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];

        dp[0]=1;
        for(int i=0; i<=amount; i++){
            for(int coin : coins){
                if(i-coin>=0){
                    dp[i] += dp[i-coin];
                }
            }
        }

        return dp[amount];
    }
    // error
}
