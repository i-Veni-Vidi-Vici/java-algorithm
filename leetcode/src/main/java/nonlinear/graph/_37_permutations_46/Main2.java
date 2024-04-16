package nonlinear.graph._37_permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void dfs(int[] nums, List<Integer> temp, List<List<Integer>> result, int index) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.isEmpty()) {
                temp.add(nums[i]);
            }

            for (int j = i+1+index; j < nums.length; j++) {
                temp.add(nums[j]);
                dfs(nums, temp, result, index+1);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(nums, new ArrayList<>(), result, 0);
        return result;
    }

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }
    // error
}
