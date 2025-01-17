package dynamicprogramming._377;

public class Practice1 {
    int result =0;

    public int combinationSum4(int[] nums, int target) {
        dfs(nums, target);
        return result;
    }

    private void dfs(int[] nums, int target){
        if(target==0){
            result++;
            return;
        }

        for(int i= 0; i<nums.length; i++){
            if(target-nums[i]>=0){
                dfs(nums, target-nums[i]);
            }
        }
    }
    // Time Limit Exceeded
}
