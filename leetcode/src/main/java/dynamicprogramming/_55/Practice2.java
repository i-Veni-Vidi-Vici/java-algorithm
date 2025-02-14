package dynamicprogramming._55;

public class Practice2 {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }

        int max =0;
        int current =0;
        for(int i=0; i<nums.length-1; i++){
            max = Math.max(max, nums[i]+i);
            if(max>=nums.length-1){
                return true;
            }

            if(i== current){
                current = max;

            }
            if(current<=i){
                return false;
            }
        }

        return false;
    }
    // 2ms
}
