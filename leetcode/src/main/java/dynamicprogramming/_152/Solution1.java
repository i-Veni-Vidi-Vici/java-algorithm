package dynamicprogramming._152;

public class Solution1 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            currMax = Math.max(Math.max(nums[i], currMax * nums[i]),
                    currMin * nums[i]);

            currMin = Math.min(Math.min(nums[i], temp * nums[i]),
                    currMin * nums[i]);

            max = Math.max(max, currMax);
        }

        return max;
    }
    // 2ms
}
