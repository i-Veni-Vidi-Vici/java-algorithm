package slidingwindow._81_sliding_window_maximum_239;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        List<Integer> result = new ArrayList<>();
        for (; right < nums.length; right++, left++) {
            int max = Integer.MIN_VALUE;
            for (int i = left; i <= right; i++) {
                max = Math.max(max, nums[i]);
            }
            result.add(max);
        }

        return result.stream().mapToInt(value -> value).toArray();
    }
    // Time Limit Exceeded
}
