package dynamicprogramming._376;

public class Practice1 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1){
            return 1;
        }

        int[] dp = new int[nums.length];
        dp[0]= 1;
        int index=1;

        for(; index<nums.length; index++){
            if(nums[index]== nums[index-1]){
                dp[index]= 1;
            } else{
                dp[index]= nums[index-1]<nums[index]? 2:-2;
                break;
            }
        }

        if(index== nums.length){
            return 1;
        }


        int max= Math.abs(dp[index]);

        for(int i=index+1; i<nums.length; i++){
            if(nums[i-1]== nums[i]){
                dp[i]= dp[i-1];
            }

            for(int j=i-1; j>=0; j--){
                if(dp[j]>0 && nums[i]<nums[j]){
                    dp[i]= -1* Math.max(Math.abs(dp[i]), Math.abs(dp[j])+1);
                }else if(dp[j]<0 && nums[i]>nums[j]){
                    dp[i]= Math.max(Math.abs(dp[i]), Math.abs(dp[j])+1);
                }
            }
            max= Math.max(Math.abs(dp[i]), max);
        }



        return max;
    }
    // error
}
