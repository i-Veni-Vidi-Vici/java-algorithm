package linear.priorityqueue._29_더맵게;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }
        while (pq.peek() < K && pq.size()>=2) {
            int value = pq.poll() + pq.poll() * 2;
            pq.add(value);
            answer++;
        }
        if (pq.peek() < K) {
            return -1;
        }

        return answer;
    }
    // 효율성  테스트
    //테스트 1 〉	통과 (186.27ms, 83.2MB)
    //테스트 2 〉	통과 (254.14ms, 86.3MB)
    //테스트 3 〉	통과 (1292.56ms, 150MB)
    //테스트 4 〉	통과 (117.93ms, 65MB)
    //테스트 5 〉	통과 (1624.96ms, 123MB)
}
