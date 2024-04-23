package nonlinear.heap._60_Kth_Largest_Element_in_an_Array_215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main1 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int num : nums) {
            pq.add(num);
        }

        int result =0;
        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }

        return result;
    }

    // 58ms
}
