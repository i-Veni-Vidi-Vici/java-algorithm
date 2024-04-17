package nonlinear.graph._39_combination_sum_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static void dfs(int[] candidates, int target, List<Integer> value, List<List<Integer>> result, int sum, int index) {

        if(sum == target){
            result.add(new ArrayList<>(value));

            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                value.add(candidates[i]);
                sum += candidates[i];
            } else {return;}

            dfs(candidates, target, value, result, sum, index);
            index ++;
            sum -= value.get(value.size() - 1);
            value.remove(value.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), result, 0, 0);
        return result;
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    // 2ms
}
