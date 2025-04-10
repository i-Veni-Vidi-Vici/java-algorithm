package dynamicprogramming._376;

public class Practice2 {
    public int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        dp[1] = 2;
        int max = 0;
        boolean prePositive = nums[0] < nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (prePositive != (nums[i - 1] < nums[i]) && nums[i - 1] != nums[i]) {
                dp[i] = dp[i - 1] + 1;

                prePositive = !prePositive;
            } else {
                if (nums[i - 1] != nums[i]) {
                    dp[i] = 2;
                } else {
                    dp[i] = 1;
                    if (i < nums.length - 1) {
                        prePositive = !(nums[i] < nums[i + 1]);
                    }
                }
            }
            System.out.println(i+" ,"+prePositive+" ,"+dp[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
    // error
}
