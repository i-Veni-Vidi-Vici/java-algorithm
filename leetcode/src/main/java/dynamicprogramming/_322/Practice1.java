package dynamicprogramming._322;

public class Practice1 {
    public int coinChange(int[] coins, int amount) {
        dfs(coins, amount, 0);
        return min==Integer.MAX_VALUE?-1:min;
    }
    int min =Integer.MAX_VALUE;
    public void dfs(int[] coins, int amount, int count){
        if(amount ==0){
            min= Math.min(min,count);
            return;
        }
        for(int i=0; i<coins.length; i++){
            if(amount- coins[i]>=0){
                dfs(coins, amount- coins[i], count+1);
            }else{
                return;
            }
        }
    }
    // Time Limit Exceeded
}
