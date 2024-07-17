package linear.array._09_three_sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int prev=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0) {
                prev = nums[i - 1];
            }
            if (nums[i] > 0) {
                break;
            }
            if (prev == nums[i]) {

                continue;
            }
            for (int j = i + 1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] > 0) {
                    break;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        boolean checked = true;
                        for (List<Integer> integers : result) {
                            if (integers.equals(List.of(nums[i], nums[j], nums[k]))) {
                                checked = false;
                                break;
                            }
                        }
                        if (checked) {

                            result.add(List.of(nums[i], nums[j], nums[k]));
                        }
                    } else if (nums[i] + nums[j] + nums[k] > 0) {
                        break;
                    }

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0});
    }

    // Time Limit Exceeded
}
