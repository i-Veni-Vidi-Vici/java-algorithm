package dynamicprogramming._92_maximum_subarray_53;

// 메모이제이션 최적화
public class Main2 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max =Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (sum + nums[i] > 0) {
                sum += nums[i];
                if (max < sum) {
                    max = sum;
                }
            } else {
                sum =0;
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
        }

        return max;
    }

    // 1ms
}
