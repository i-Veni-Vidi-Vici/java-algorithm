package divideandconquer._89_majority_element_169;

import java.util.Arrays;

public class Practice1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int count =0;
        for (int num : nums) {

            if (prev == num) {
                count++;
            }
            if (count > nums.length / 2) {
                return prev;
            }
            prev = num;
        }

        return -1;
    }

    // 6ms
}
