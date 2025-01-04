package dynamicprogramming._152;

public class Practice1 {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){

            dp[i]= nums[i];
            int current = nums[i];
            for(int j=i+1; j<nums.length; j++){
                current *= nums[j];
                dp[i]= Math.max(dp[i], current );
            }
            max= Math.max(dp[i], max);
        }

        return max;
    }
    // 324ms
}
