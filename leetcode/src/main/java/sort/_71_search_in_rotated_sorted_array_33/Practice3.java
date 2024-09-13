package sort._71_search_in_rotated_sorted_array_33;

public class Practice3 {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int minIndex = 0;
        while(left<=right){
            int mid = left+ (right-left)/2;

            if(nums[mid]>=nums[minIndex]){
                left = mid+1;
            } else if(nums[mid]< nums[minIndex]){
                minIndex=mid;
                right = mid-1;
            }
        }

        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            int pivotMid = (mid+minIndex)% nums.length;
            if(nums[pivotMid]== target){
                return pivotMid;
            }else if(nums[pivotMid]> target){
                right= mid-1;
            }else if(nums[pivotMid]< target){
                left = mid+1;
            }
        }
        return -1;
    }

    // 0ms
}
