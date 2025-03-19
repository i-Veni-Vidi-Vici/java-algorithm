package linear.array._16;

import java.util.*;

public class Practice2 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = nums[0]+ nums[1]+nums[2];

        for(int i=0; i<nums.length; i++){
            int left =i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+ nums[left]+ nums[right];
                if(Math.abs(target-sum)<Math.abs(target-min)){
                    min = sum;
                }

                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }else{
                    return min;
                }
            }
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
        }

        return min;
    }
    // 15ms
}
