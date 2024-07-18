package linear.array._10_array_partition_561;

import java.util.Arrays;

public class Practice1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }

        return result;
    }

    // 12ms
}
