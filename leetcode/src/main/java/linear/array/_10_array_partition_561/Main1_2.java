package linear.array._10_array_partition_561;

import java.util.Arrays;

public class Main1_2 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // 최악 O(n^2)
        int result = 0;

        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }

        return result;
    }

    // 12ms, min 메서드 제거
}
