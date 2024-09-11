package sort._70_binary_search_704;

public class Practice2 {
    public int search(int[] nums, int target) {
        return dfs(nums, target, 0, nums.length-1);
    }
    private int dfs(int[]nums, int target, int left, int right){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;

        if(nums[mid]== target){
            return mid;
        }else if(nums[mid]< target){
            return   dfs(nums, target, mid+1, right);
        }else if(nums[mid]> target){
            return dfs(nums, target, left, mid-1);

        }

        return -1;
    }
    // 0ms
}
