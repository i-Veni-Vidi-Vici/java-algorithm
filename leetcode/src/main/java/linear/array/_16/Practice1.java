package linear.array._16;

import java.util.*;

public class Practice1 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                if (Math.abs(target - (nums[i] + nums[left] + nums[right])) < Math.abs(target - min)) {
                    min = nums[i] + nums[left] + nums[right];

                }
                left++;
                right--;
            }
        }

        return min;
    }
    // leetcode error
}
