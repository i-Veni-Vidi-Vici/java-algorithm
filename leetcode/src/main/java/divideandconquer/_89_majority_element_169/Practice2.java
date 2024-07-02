package divideandconquer._89_majority_element_169;

import java.util.Arrays;

public class Practice2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int count =1;
        if (nums.length == 1) {
            return prev;
        }
        for (int i = 1; i <nums.length; i++) {
            if (prev == nums[i]) {
                count++;
            }else {
                count=0;
            }
            if (count > nums.length / 2 || nums[i+nums.length/2]==nums[i]) {
                return nums[i];
            }
            prev = nums[i];
        }

        return -1;
    }
}
