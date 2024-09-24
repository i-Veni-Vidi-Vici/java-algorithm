package slidingwindow._81_sliding_window_maximum_239;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Practice3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> result= new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(!queue.isEmpty() && queue.peek()<i-k+1){
                queue.poll();
            }

            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                max= nums[i];
                queue.pollLast();
            }

            queue.add(i);

            if(i<=i-k+1){
                result.add(queue.peek());
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    // error
}
