package linear.array._26;

public class Practice1 {
    public int removeDuplicates(int[] nums) {
        int index= 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!= nums[i]){
                nums[index++] = nums[i];
                System.out.println(nums[i]);
            }
        }

        return index;
    }

    // 18ms
}
