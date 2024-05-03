package sort._71_search_in_rotated_sorted_array_33;

public class Main1 {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;

        if (nums[right] < target) {
            if (nums[mid] < target) {
                right= mid+1;
            } else {
                right= mid-1;
            }
        }
        if (nums[left] > target) {
            if (nums[mid] > nums[left] ) {
                left = mid+1;
            } else {
                left = mid-1;
            }
        }
        mid = left + (right-left)/2;

        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid+1;
            }
            if (nums[mid] > target) {
                right = mid-1;
            }
            mid = left + (right-left)/2;
        }

        return -1;
    }
    // eroro
}
