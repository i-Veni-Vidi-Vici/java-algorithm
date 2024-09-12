package sort._71_search_in_rotated_sorted_array_33;

public class Practice2 {
    public static int search(int[] nums, int target) {
        int min = nums[0];
        int minIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }
            if(min>nums[i]){
                min = nums[i];
                minIndex =i;
                break;
            }
        }

        return dfs(nums, target, 0, nums.length-1, minIndex);
    }

    public static int dfs(int[] nums, int target, int left, int right, int minIndex){
        int mid = left + (right-left)/2;

        if(left>right){
            return -1;
        }

        if(nums[(mid+ minIndex)%(nums.length)] == target){
            return (mid+ minIndex)%(nums.length);
        }
        if(nums[(mid+ minIndex)%(nums.length)] < target){
            return dfs(nums, target, mid+1, right, minIndex);
        }
        if(nums[(mid+ minIndex)%(nums.length)] > target){
            return dfs(nums, target, left, mid-1, minIndex);
        }

        return -1;
    }

    public static void main(String[] args) {
        search(new int[]{1,3},1);
    }

    // 0ms
}
