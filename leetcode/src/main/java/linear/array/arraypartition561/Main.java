package linear.array.arraypartition561;

import java.util.Arrays;

public class Main {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // 최악 O(n^2)
        int result = 0;

        for (int i = 0; i < nums.length; i += 2) {
            result += Math.min(nums[i], nums[i + 1]);
        }

        return result;
    }

// 13~14ms
}
