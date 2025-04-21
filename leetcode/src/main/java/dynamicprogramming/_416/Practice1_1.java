package dynamicprogramming._416;

public class Practice1_1 {
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int num : nums){
            sum +=num;
        }
        if(sum%2 ==1){
            return false;
        }
        boolean[] dp = new boolean[sum/2+1];

        dp[0] = true;

        for(int num : nums){
            for(int i=dp.length-1; i>0; i--){
                if(i>=num){
                    dp[i] = dp[i] | dp[i-num];
                }
            }
        }

        return dp[dp.length-1];
    }

    // 24ms
}
