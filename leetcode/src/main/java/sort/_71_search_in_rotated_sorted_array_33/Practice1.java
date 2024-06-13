package sort._71_search_in_rotated_sorted_array_33;


import java.util.Arrays;

public class Practice1 {
    public static int search(int[] nums, int target) {
        int mid = 0; // 가장 작은값의 index
        int left = 0;
        int maxValue = nums[0];
        int right = nums.length - 1;

        if (nums[0] > nums[nums.length - 1]) {
            while (left <= right) {
                mid = (left + right) >>> 1;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] >= maxValue) {
                    maxValue = nums[mid];
                    if (mid < nums.length - 1 && nums[mid + 1] > nums[mid]) {
                        left = mid + 1;
                    } else {
                        mid++;
                        break;
                    }
                } else if (nums[mid] < maxValue) {
                    if (mid > 0 && nums[mid - 1] < nums[mid]) {
                        right = mid - 1;
                    } else {
                        break;
                    }
                }
            }
            if (target >= nums[0]) {
                int result = Arrays.binarySearch(nums, 0, mid, target);
                return result >= 0 ? result : -1;
            } else {
                int result = Arrays.binarySearch(nums, mid, nums.length, target);
                return result >= 0 ? result : -1;
            }
        } else {
            int result = Arrays.binarySearch(nums, target);
            return result >= 0 ? result : -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3, 5, 1}, 3));
    }

    // 0ms
}
