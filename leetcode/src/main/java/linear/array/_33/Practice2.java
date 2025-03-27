package linear.array._33;

public class Practice2 {
    public int search(int[] nums, int target) {
        int left =0;
        int right =nums.length-1;
        int mid = left+ (right-left)/2;

        while(left<= right){
            if(nums[mid]== target){
                return mid;
            }
            if(nums[left]<=target){
                if(nums[mid]>target){
                    right= mid-1;
                }else{
                    left = mid+1;
                }
            }
            else if(target<=nums[right]){
                left= mid+1;
            } else{
                return -1;
            }

            mid = left+ (right-left)/2;
        }

        return -1;
    }

    // error
}
