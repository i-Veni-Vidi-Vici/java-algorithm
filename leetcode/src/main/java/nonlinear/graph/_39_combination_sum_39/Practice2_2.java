package nonlinear.graph._39_combination_sum_39;

import java.util.ArrayList;
import java.util.List;

public class Practice2_2 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(candidates, target, result, new ArrayList<>(), 0, 0);

        return result;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> result, List<Integer> value, int sum,
                     int index) {
        if (target == sum) {
            result.add(new ArrayList<>(value));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                value.add(candidates[i]);
                dfs(candidates, target, result, value, sum + candidates[i], i);
                value.remove(value.size() - 1);
            }
        }
    }
    // 1ms, Practice2 에서 정렬제거
}
