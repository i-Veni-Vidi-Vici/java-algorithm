package dynamicprogramming._94_house_robber_198;

public class Practice2 {
    public int rob(int[] nums) {
        int sum =0;
        if(nums.length<4){
            return Math.max(nums[0]+nums[2], nums[1]);
        }
        int i=0;
        while( i<nums.length-3){
            if(nums[i]+ Math.max(nums[i+2], nums[i+3])> nums[i+1] + nums[i+3]){
                sum+=nums[i];
                i+=2;
            }else{
                sum+= nums[i+1];
                i+=1;
            }
        }
        if(i+2==nums.length-1){
            if(nums[i]+nums[i+2]> nums[i+1]){
                return sum+nums[i+2];
            } else{
                return sum+nums[i+1];
            }
        }
        return sum;
    }
    // error
}
