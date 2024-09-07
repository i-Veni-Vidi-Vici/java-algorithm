package nonlinear.heap._60_Kth_Largest_Element_in_an_Array_215;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice4 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>((o1, o2)-> o2-o1);

        for(int num : nums){
            queue.add(num);
        }

        int result = 0;
        for(int i=0; i<k; i++){
            result = queue.poll();
        }

        return result;
    }
}
