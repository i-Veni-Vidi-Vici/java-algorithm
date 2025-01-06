package dynamicprogramming._213;

public class Practice1 {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];

        dp[0]=nums[0];
        dp[1] = nums[1];
        for(int i=2; i<nums.length-2; i++){
            dp[i]= Math.max(dp[i-2]+nums[i], Math.max(dp[i-2], dp[i-1])+nums[i+1]);
        }

        return dp[nums.length-2];
    }
    // error
}
