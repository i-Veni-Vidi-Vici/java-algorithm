package divideandconquer._89_majority_element_169;

import java.util.Arrays;

public class Solution3 {
    public int majorityElement(int[] nums) {
        // 정렬 후 가운데 지점을 정답으로 리턴
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // 4ms
}
