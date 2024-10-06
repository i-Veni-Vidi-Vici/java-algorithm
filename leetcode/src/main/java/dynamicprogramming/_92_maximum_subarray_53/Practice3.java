package dynamicprogramming._92_maximum_subarray_53;

import java.util.Arrays;

public class Practice3 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum>0){
                nums[i]+= sum;
            }
            sum = nums[i];
        }

        return Arrays.stream(nums).max().getAsInt();
    }
    // 4ms
}
