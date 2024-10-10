package dynamicprogramming._94_house_robber_198;

public class Practice3 {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        // 이전, 전전 + 오늘 현재 결과
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }

        nums[1]= Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            nums[i]= Math.max(nums[i-2]+ nums[i], nums[i-1]);
        }

        return nums[nums.length-1];
    }

    // 0ms
}
