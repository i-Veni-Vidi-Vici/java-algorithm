package dynamicprogramming._494;

public class Practice1_1 {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0, 0);
    }

    private int dfs(int[] nums, int target, int cur, int index){
        if(index == nums.length && cur == target){
            return 1;
        } else if(index == nums.length){
            return 0;
        }

        int minus = dfs(nums, target, cur-nums[index], index+1);
        int plus = dfs(nums, target, cur+nums[index], index+1);


        return minus + plus;
    }

    // 684ms
}
