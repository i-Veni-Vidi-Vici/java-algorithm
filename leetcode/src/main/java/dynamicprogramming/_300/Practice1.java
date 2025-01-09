package dynamicprogramming._300;

import java.util.*;

public class Practice1 {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                dp[i]= dp[i-1]+1;
                max = Math.max(max, dp[i]);
            } else{
                for(int j=i-2; j>=0; j--){
                    if(nums[j]<nums[i]){
                        dp[i] = dp[j]+1;
                        break;
                    }
                }

            }
        }

        return max;
    }
    // error
}
