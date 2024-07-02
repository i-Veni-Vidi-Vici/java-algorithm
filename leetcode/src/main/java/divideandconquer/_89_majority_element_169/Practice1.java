package divideandconquer._89_majority_element_169;

import java.util.Arrays;

public class Practice1 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int count =0;
        for (int num : nums) {

            if (prev == num) {
                count++;
            } else {    // else 제거해도 됨
                count=1;
            }
            if (count > nums.length / 2) {
                return prev;
            }
            prev = num;
        }

        return -1;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{3,2,3});
    }
    // 4ms
}
