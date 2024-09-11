package sort._69_sort_colors_75;

public class Practice2 {
    public void sortColors(int[] nums) {
        int redIndex =0;
        int whiteIndex =0;
        int blueIndex =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]== 0){
                nums[i] =nums[redIndex];
                nums[redIndex] = 0;
                redIndex++;
                whiteIndex++;
                blueIndex++;
            }
            else if(nums[i]== 1){
                nums[i] =nums[whiteIndex];
                nums[whiteIndex] = 1;
                whiteIndex++;
                blueIndex++;
            }
            else if(nums[i]== 2){
                nums[i] =nums[blueIndex];
                nums[blueIndex] = 2;
                blueIndex++;
            }
        }


    }
    // error
}
