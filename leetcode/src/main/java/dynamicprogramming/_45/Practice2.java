package dynamicprogramming._45;

public class Practice2 {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int start = nums[0];
        int max=0;
        int count =0;

        for(int i=0; i<nums.length; ){
            while(start>=i && i<nums.length){
                max = Math.max(nums[i]+i,max);
                i++;
            }

            start= max;
            count++;
        }

        return count;
    }
    // 1ms
}
