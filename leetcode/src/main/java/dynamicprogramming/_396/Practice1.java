package dynamicprogramming._396;

public class Practice1 {
    public int maxRotateFunction(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur =0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                cur += ((i+j)%nums.length)* nums[j];
            }
            max = Math.max(max, cur);
            cur =0;
        }

        return max;
    }

    // Time Limit Exceeded
}
