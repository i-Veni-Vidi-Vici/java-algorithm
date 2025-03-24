package linear.array._31;

public class Practice1 {
    public void nextPermutation(int[] nums) {

        int index= 0;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                int j=nums.length-1;
                while(nums[i]>=nums[j]){
                    j--;
                }

                int tmp= nums[i];
                nums[i]= nums[j];
                nums[j] = tmp;
                index =i+1;
                break;
            }
        }

        int last = nums.length-1;
        for(int i=index; i<(nums.length-index)/2+index; i++){
            int tmp= nums[i];
            nums[i]= nums[last];
            nums[last] = tmp;
            last--;
        }
    }
    // 0ms
}
