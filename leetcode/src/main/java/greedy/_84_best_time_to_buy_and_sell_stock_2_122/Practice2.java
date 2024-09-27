package greedy._84_best_time_to_buy_and_sell_stock_2_122;

public class Practice2 {
    public int maxProfit(int[] prices) {
        int value =Integer.MAX_VALUE;
        int result =0;
        for(int price : prices){
            if(value<price){
                result +=price-value;
                value = price;
            }else{
                value = price;
            }
        }

        return result;
    }
    // 0ms
}
