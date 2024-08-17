package nonlinear.graph._40_subsets_78;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(nums, result, new ArrayList<>(), 0);

        return result;
    }


    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> value, int index) {
        for (int i = index; i <nums.length; i++) {
            value.add(nums[i]);
            result.add(new ArrayList<>(value));
            dfs(nums, result, value, i+1);
            value.remove(value.size() - 1);
        }

    }

    // 0ms
}
