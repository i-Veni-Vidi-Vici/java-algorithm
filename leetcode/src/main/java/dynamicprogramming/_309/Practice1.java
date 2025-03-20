package dynamicprogramming._309;

public class Practice1 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int max =0;
        for(int i=0; i<prices.length; i++){
            for(int j=0; j<i; j++){
                dp[i]= Math.max(dp[i], dp[j]+ prices[i]-prices[j]);
            }
            max= Math.max(max, dp[i]);
        }

        return max;
    }
    // error
}
