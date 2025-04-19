package dynamicprogramming._413;

public class Practice2_1 {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int result =0;

        for(int i=2; i<nums.length; i++){
            if((nums[i]- nums[i-1]) == (nums[i-1] - nums[i-2])){
                count ++;
                result +=count;
            }else{
                count =0;
            }
        }

        return result;
    }
    // 0ms
}
