package nonlinear.graph._40_subsets_78;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void dfs(List<List<Integer>> result, int[] nums, int index, List<Integer> value) {

        for (int i = index; i < nums.length; i++) {
            value.add(nums[i]);
            result.add(new ArrayList<>(value));
            dfs(result, nums, i+1, value);
            value.remove(value.size() - 1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(result, nums, 0, new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3});
    }

    // 1ms
}
