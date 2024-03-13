package nonlinear.graph.subsets78;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> temp, int start) {

        for (int i = start; i < nums.length; i++) {

            temp.add(nums[i]);
            result.add(new ArrayList<>(temp));

            dfs(nums, result, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(nums, result, new ArrayList<>(), 0);

        return result;
    }

    // 1ms
}
