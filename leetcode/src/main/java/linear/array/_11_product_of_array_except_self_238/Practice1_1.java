package linear.array._11_product_of_array_except_self_238;

public class Practice1_1 {
    public int[] productExceptSelf(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]= 1;
        for(int i=1; i<nums.length; i++){
            dp[i]= dp[i-1] * nums[i-1];

        }
        int a = nums[nums.length-1];
        for(int i=dp.length-2; i>=0; i--){
            dp[i]*= a;
            a*= nums[i];

        }

        return dp;
    }
    // 2ms
}
