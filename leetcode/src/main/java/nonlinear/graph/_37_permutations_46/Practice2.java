package nonlinear.graph._37_permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            dfs(nums, i,result, new ArrayList<>());
        }

        return result;
    }

    public void dfs(int[] nums, int index, List<List<Integer>> result, List<Integer> value) {
        if (value.size() == nums.length) {
            result.add(value);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            value.add(nums[index]);
            dfs(nums, ++index, result, value);
        }

        // error
    }
}
