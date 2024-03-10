package nonlinear.graph.combinations39;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void dfs(List<List<Integer>> result, int target,int start, List<Integer> temp, int[] candidates) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            dfs(result, target - candidates[i], i, temp, candidates);
            temp.remove(temp.size() - 1);
        }
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, target, 0, new ArrayList<>(), candidates);
        return result;
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    // 2ms
}
