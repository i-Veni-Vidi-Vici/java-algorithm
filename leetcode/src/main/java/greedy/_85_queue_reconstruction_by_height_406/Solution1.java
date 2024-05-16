package greedy._85_queue_reconstruction_by_height_406;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// TODO : 우선순위 큐 사용
public class Solution1 {
    public static int[][] reconstructQueue(int[][] people) {
        // 우선순위 큐 선언, 정렬 기준은 큰 키 우선, 값이 같다면 앞에 줄 서 있는 사람이 작은 순으로
        Queue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ?
                        b[0] - a[0] : a[1] - b[1]
        );

        // 우선순위 큐에 배열 입력값 삽입
        for (int[] person : people)
            pq.add(person);

        List<int[]> result = new ArrayList<>();
        // 우선순위 큐에서 모두 추출할 때까지 반복
        while (!pq.isEmpty()) {
            // 큰 키 우선, 앞에 줄 서 있는 사람이 작은 순으로 추출
            int[] person = pq.poll();
            // 앞에 줄 서 있는 사람을 인덱스로 정해서 삽입
            result.add(person[1], person);
        }
        // 최종 결과 자료형에 맞게 변환하여 리턴
        return result.toArray(new int[people.length][2]);
    }

    public static void main(String[] args) {
        reconstructQueue(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}});
    }

    // 5ms
}
