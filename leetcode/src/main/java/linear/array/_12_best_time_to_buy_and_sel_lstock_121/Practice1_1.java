package linear.array._12_best_time_to_buy_and_sel_lstock_121;

public class Practice1_1 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int cur = prices[0];
        for(int i=1; i<prices.length; i++){
            max= Math.max(max,prices[i]-cur);

            cur = Math.min(cur, prices[i]);
        }

        return max;
    }
    // 2ms
}
