package dynamicprogramming._416;

import java.util.*;

public class Practice1 {
    public boolean canPartition(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        int left = 0;

        Arrays.sort(nums);
        int leftSum = 0;
        int rightSum = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
        }

        int index = 0;
        while (leftSum > rightSum) {
            if (left < nums.length - 1) {
                if (leftSum - nums[left] > rightSum + nums[left]) {
                    left++;
                } else {
                    leftSum -= nums[left];
                    rightSum += nums[left];
                    break;
                }
            } else {
                leftSum -= nums[index];
                rightSum += nums[index];
                index++;
                left = index;
            }
        }

        return leftSum == rightSum;
    }
    // error
}
