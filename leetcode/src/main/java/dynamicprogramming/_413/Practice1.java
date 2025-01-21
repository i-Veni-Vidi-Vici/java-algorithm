package dynamicprogramming._413;

public class Practice1 {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[i-1]- nums[i-2] == nums[i]-nums[i-1]){
                dp[i]=dp[i-1]+1;
            }else{
                dp[i]= 1;
                if(i<nums.length-1){
                    dp[i+1]=2;
                    i++;
                }
            }
        }
        int result =0;
        int sum=1;
        for(int i=0; i<nums.length; i++){
            if(dp[i]>=3){
                result+= sum;
                sum++;
            }else{
                sum=1;
            }
        }

        return result;
    }
    // error
}
