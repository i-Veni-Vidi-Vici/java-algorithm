package dynamicprogramming._92_maximum_subarray_53;

public class Practice2 {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right =nums.length-1;
        boolean check =true;
        while(check){
            check =false;
            if(nums[left]<nums[left+1] && nums[left]<=0 ){
                left++;
                check =true;
            }
            if(nums[right]>=0 && nums[right-1]<=0 && nums[right]<Math.abs(nums[right-1])){
                right--;
                check =true;
            }
        }
        int result =0;
        for(int i =left; i<=right; i++){
            result += nums[i];
        }

        return result;
    }
    // error
}
