package greedy._84_best_time_to_buy_and_sell_stock_2_122;

public class Practice3 {
    public int maxProfit(int[] prices) {
        int result =0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]< prices[i+1]){
                result+= prices[i+1]-prices[i];
            }
        }

        return result;
    }
    // 1ms
}
