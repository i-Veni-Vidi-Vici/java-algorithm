package nonlinear.heap._60_Kth_Largest_Element_in_an_Array_215;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        // 우선순위 큐 선언, 자바 기본은 최소 힙이므로 최대 힙으로 정렬 지정
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 입력값을 모두 힙에 삽입한다.
        for (int n : nums)
            pq.add(n);

        // k - 1만큼 힙에서 추출한다.
        for (int i = 0; i < k - 1; i++)
            pq.poll();

        // k번째 마지막 값을 정답으로 리턴
        return pq.poll();
    }
    // 70 ms (Collections.reverseOrder()로 기존 풀이보다 느려짐 )
}