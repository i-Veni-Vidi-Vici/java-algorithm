package dynamicprogramming._45;

public class Practice1 {
    public int jump(int[] nums) {
        int jump=1;
        int current=nums[0]-1;
        if(nums.length==1){
            return 0;
        }
        if(current+1>= nums.length-1){
            return 1;
        }

        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>current){
                current= nums[i];
                jump++;
                if(current+i>=nums.length-1){
                    return jump;
                }
            }

            current--;
        }

        return jump;
    }
    // error
}
