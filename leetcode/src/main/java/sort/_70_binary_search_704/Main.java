package sort._70_binary_search_704;

public class Main {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (nums[mid] != target) {
            if ((left+1 ) >=right) {
                if(nums[left]== target){
                    return left;
                }
                if(nums[right]== target){
                    return right;
                }
                return -1;
            }
            if (nums[mid] < target) {
                left = mid;
            }
            if (nums[mid] > target) {
                right = mid;
            }
            mid = left + (right - left) / 2;
        }

        return mid;
    }

    // 0ms
}
