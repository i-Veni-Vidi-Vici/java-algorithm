package linear.array._12_best_time_to_buy_and_sel_lstock_121;

public class Practice1 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result =0;
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i]) {
                result = Math.max(result, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        return result;
    }
    // 1ms
}

