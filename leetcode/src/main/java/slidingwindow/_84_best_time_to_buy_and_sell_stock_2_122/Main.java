package slidingwindow._84_best_time_to_buy_and_sell_stock_2_122;

public class Main {
    public int maxProfit(int[] prices) {
        int current =prices[0];
        int result =0;

        for (int i = 1; i < prices.length; i++) {
            if (current > prices[i]) {
                current = prices[i];
            } else if (current < prices[i]) {
                result += prices[i] - current;
                current = prices[i];
            }
        }

        return result;
    }

    // 1ms
}
