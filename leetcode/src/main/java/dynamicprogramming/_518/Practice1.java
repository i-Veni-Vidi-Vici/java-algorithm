package dynamicprogramming._518;

public class Practice1 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];

        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i-coins[j]>=0){
                    dp[i]+= dp[i-coins[j]]+1;
                }

            }
        }

        return dp[amount];
    }
    // error
}
