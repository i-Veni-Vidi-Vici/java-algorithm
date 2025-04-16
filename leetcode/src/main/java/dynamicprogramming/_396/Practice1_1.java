package dynamicprogramming._396;

public class Practice1_1 {
    public int maxRotateFunction(int[] nums) {
        int max = 0;
        int cur =0 ;
        int sum =0;
        for(int num : nums){
            sum += num;
        }

        for(int i=0; i<nums.length; i++){
            cur += i*nums[i];
        }
        max = cur;

        for(int i=0; i<nums.length; i++){
            cur = cur+ sum -nums.length*nums[nums.length-1-i];
            max = Math.max(max, cur);
        }

        return max;
    }
    // 4ms
}
