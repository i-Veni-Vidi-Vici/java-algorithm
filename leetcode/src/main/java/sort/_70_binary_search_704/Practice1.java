package sort._70_binary_search_704;

public class Practice1 {
    public static int search(int[] nums, int target) {
        int index;
        int left = 0;
        int right = nums.length-1;

        while (left<=right) {
            index = (right - left) / 2+left;
            if (nums[index] == target) {
                return index;
            }
            else if (nums[index] < target) {
                left = index+1;
            } else if (nums[index] > target) {
                right = index -1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        search(new int[]{5}, 5);
    }

    // 0ms
}
