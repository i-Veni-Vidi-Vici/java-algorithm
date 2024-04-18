package nonlinear.graph._40_subsets_78;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void dfs(int[] nums, List<List<Integer>> result, int start, List<Integer> temp) {
        if (temp.size() < nums.length) {
            result.add(new ArrayList<>(temp));
        } else if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);

            dfs(nums, result, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(nums, result, 0, new ArrayList<>());
        return result;
    }
}
// 1ms
