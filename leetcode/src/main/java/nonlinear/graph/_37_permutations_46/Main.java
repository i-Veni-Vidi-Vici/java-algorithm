package nonlinear.graph._37_permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private void dfs(List<List<Integer>> result, int[] nums, int index, List<Integer> temp) {

        if (index >= nums.length) {
            return;
        }

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            temp.clear();
        }

        temp.add(nums[index]);

        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                temp.add(nums[i]);
            }
        }

        dfs(result, nums, index + 1, temp);
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, nums, 0, new ArrayList<>());

        return result;
    }
}
//error
