package dynamicprogramming._322;

public class Practice2 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];



        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length &&  coins[j]<=i; j++){

                dp[i]= Math.min(dp[i-coins[j]]+1, dp[i]!= 0? dp[i]:Integer.MAX_VALUE);

            }
        }


        return dp[amount];
    }

    // error
}
