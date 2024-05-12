package slidingwindow._81_sliding_window_maximum_239;

public class Main1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length-k+1; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j < i+k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }

        return result;
    }
    // Time Limit Exceeded
}
