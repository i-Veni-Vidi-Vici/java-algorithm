package dynamicprogramming._309;

public class Practice2_1 {
    public int maxProfit(int[] prices) {
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        int[] cool = new int[prices.length];

        buy[0] = -prices[0];

        for(int i=1; i<prices.length; i++){
            buy[i]= Math.max(buy[i-1], cool[i-1]-prices[i]);
            sell[i] = Math.max(sell[i-1], buy[i-1]+ prices[i]);
            cool[i]= Math.max(cool[i-1], sell[i-1]);
        }

        return sell[prices.length-1];
    }
    // 0ms
}
