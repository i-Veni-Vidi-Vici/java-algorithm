package dynamicprogramming._494;

public class Solution1 {
    private int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
            return;
        }

        dfs(nums, target, index + 1, sum + nums[index]);

        dfs(nums, target, index + 1, sum - nums[index]);
    }
    // 643ms
}
