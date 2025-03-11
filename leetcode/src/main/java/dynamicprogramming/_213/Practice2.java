package dynamicprogramming._213;

public class Practice2 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]= nums[0];
        dp[1]=  nums[0];

        int[] dp2 = new int[nums.length];
        dp2[0]= -1;
        dp2[1]=  nums[1];


        for(int i=2; i<nums.length-1; i++){
            dp[i]= Math.max(dp[i-1], dp[i-2]+nums[i]);
        }

        for(int i=2; i<nums.length; i++){
            dp2[i]= Math.max(dp2[i-1], dp2[i-2]+nums[i]);
        }

        return Math.max(dp[nums.length-2], dp2[nums.length-1]);
    }
    // error
}
