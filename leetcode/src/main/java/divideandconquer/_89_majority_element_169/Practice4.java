package divideandconquer._89_majority_element_169;

public class Practice4 {
    public int majorityElement(int[] nums) {
        return dfs(0, nums.length-1, nums);
    }

    public int dfs(int left, int right, int[] nums){
        if(left == right){
            return nums[left];
        }
        int mid = left + (right-left)/2;
        int a = dfs(left, mid, nums);
        int b = dfs(mid +1, right, nums);

        int count =0;
        for(int i=left; i<right; i++){
            if(nums[i] == a){
                count++;
            }
        }

        return count > (right-left+1)/2 ? a : b;
    }
    // 3ms
}
