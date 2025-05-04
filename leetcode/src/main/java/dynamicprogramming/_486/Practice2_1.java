package dynamicprogramming._486;

public class Practice2_1 {
    public boolean predictTheWinner(int[] nums) {
        return dfs(0, nums.length - 1, nums) >= 0;
    }

    private int dfs(int start, int end, int[] nums) {
        if (start == end) {
            return nums[start];
        }

        int left = nums[start] - dfs(start + 1, end, nums);
        int right = nums[end] - dfs(start, end - 1, nums);

        return Math.max(left, right);
    }
    // 70ms
}
