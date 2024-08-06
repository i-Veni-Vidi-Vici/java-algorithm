package linear.priorityqueue._29_더맵게;

import java.util.PriorityQueue;

public class Main {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int food : scoville) {
            queue.add(food);
        }

        while (K > queue.peek()) {
            if (queue.size() == 1) {
                return -1;
            }

            queue.add(queue.poll() + (queue.poll() * 2));
            answer++;
        }

        return answer;
    }
    // 정확성: 83.9
    // 효율성: 16.1
    // 합계: 100.0 / 100.0
}
