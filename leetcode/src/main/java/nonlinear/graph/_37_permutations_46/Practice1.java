package nonlinear.graph._37_permutations_46;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> value) {
        if (value.size() == nums.length) {
            result.add(new ArrayList<>(value));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!value.contains(nums[i])) {
                List<Integer> value2 =new ArrayList<>(value);
                value2.add(nums[i]);
                dfs(nums, result,value2);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> value = new ArrayList<>();
            value.add(nums[i]);
            dfs(nums, result,value);
        }

        return result;
    }

    // 1~2 ms
}
