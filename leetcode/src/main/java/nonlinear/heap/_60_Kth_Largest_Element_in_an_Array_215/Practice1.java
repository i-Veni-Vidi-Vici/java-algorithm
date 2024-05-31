package nonlinear.heap._60_Kth_Largest_Element_in_an_Array_215;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        int result =0;

        for (int num : nums) {
            pq.add(num);
        }

        for (int i = 0; i < k; i++) {
            result =pq.poll();
        }

        return result;
    }
     // 59ms
}
