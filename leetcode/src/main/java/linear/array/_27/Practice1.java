package linear.array._27;

public class Practice1 {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int index =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[index++]= nums[i];
                count++;
            }
        }

        return count;
    }
    // 0ms
}
