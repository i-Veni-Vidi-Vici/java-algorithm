package slidingwindow._81_sliding_window_maximum_239;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i+k-1<nums.length; i++){
            int max =Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                if(max<nums[j]){
                    max = nums[j];
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    // error
}
