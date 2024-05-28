package dynamicprogramming._92_maximum_subarray_53;

public class Main1 {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 0;
        int sum =Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = left; j <= i; j++) {
                currentSum += nums[j];
            }
            if (sum <currentSum) {
                sum =currentSum;
                left = i;
            }

        }

        return sum;
    }
    // error
}
