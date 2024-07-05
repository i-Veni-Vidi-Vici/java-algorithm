package dynamicprogramming._92_maximum_subarray_53;

public class Practice1 {
    public int maxSubArray(int[] nums) {
        int sum =0;
//        int maxSum = Arrays.stream(nums).max().getAsInt();
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] <= 0) {
                sum = 0;

            } else if (sum + nums[i] > 0 && nums[i] < 0) {
                sum += nums[i];
            } else if (nums[i] > 0) {
                sum += nums[i];
                maxSum = Math.max(sum, maxSum);
            }
            maxSum= Math.max(maxSum, nums[i]);
        }

        return maxSum;
    }

    // 2ms
}
