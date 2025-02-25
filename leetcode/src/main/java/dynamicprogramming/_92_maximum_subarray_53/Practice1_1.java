package dynamicprogramming._92_maximum_subarray_53;

public class Practice1_1 {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<nums.length; i++){
            if(sum+nums[i]>0){
                sum+= nums[i];
                max= Math.max(max, sum);
            }
            else{
                max= Math.max(max, nums[i]);
                sum =0;
            }

        }

        return max;
    }
    // 1ms
}
