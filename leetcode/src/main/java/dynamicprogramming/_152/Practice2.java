package dynamicprogramming._152;

public class Practice2 {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0]= nums[0];
        dp[0][1]= nums[0];
        int max = dp[0][0];
        for(int i=1; i<nums.length; i++){
            dp[i][0]= Math.max(Math.max(dp[i-1][0], dp[i-1][1])*nums[i], nums[i]);
            dp[i][1]= Math.min(dp[i-1][0], dp[i-1][1])*nums[i];
            max= Math.max(Math.max(dp[i][0], dp[i][1]), max);
        }

        return max;
    }
    // error
}
