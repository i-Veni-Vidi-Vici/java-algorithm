package dynamicprogramming._376;

public class Practice2_2 {
    public int wiggleMaxLength(int[] nums) {
        int up =1;
        int down =1;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                down = up+1;
            } else if(nums[i-1]>nums[i]){
                up = down +1;
            }
        }

        return Math.max(up, down);
    }
    // 0ms
}
