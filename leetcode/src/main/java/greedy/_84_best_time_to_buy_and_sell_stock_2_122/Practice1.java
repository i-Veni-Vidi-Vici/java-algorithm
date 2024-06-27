package greedy._84_best_time_to_buy_and_sell_stock_2_122;

public class Practice1 {
    public int maxProfit(int[] prices) {
        int sum =0;
        int value = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < value) {
                value = prices[i];
            } else if (prices[i] > value) {
                sum += prices[i] - value;
                value = prices[i];
            }
        }

        return sum;
    }

    // 1ms
}
