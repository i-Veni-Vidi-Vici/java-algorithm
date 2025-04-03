package dynamicprogramming._368;

import java.util.*;

public class Practice2_1 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp =new int[nums.length];
        int[] prev= new int[nums.length];
        int max =0;
        int maxIndex =0;
        Arrays.fill(prev, -1);
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1 ){
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }

            }
            if(max< dp[i]){
                max= dp[i];
                maxIndex =i;
            }
        }
        List<Integer> result = new ArrayList<>();
        while(maxIndex>=0){
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        return result;
    }
    // 14ms
}
