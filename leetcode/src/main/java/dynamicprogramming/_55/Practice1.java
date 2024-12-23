package dynamicprogramming._55;

public class Practice1 {
    public boolean canJump(int[] nums) {
        int current = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length-1; i++){
            if(current>=i){
                max =Math.max(max, i+ nums[i]);
                current = max;
            } else{
                return false;
            }
        }

        return max>=nums.length-1;
    }
    // 3ms
}
