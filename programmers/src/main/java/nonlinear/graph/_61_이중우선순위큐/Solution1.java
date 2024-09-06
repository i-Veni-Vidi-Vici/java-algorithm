package nonlinear.graph._61_이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// TODO : 우선순위 큐 사용
public class Solution1 {
    public static int[] solution(String[] operations) {
        // 우선순위 큐 선언, 자바 기본은 최소 힙이므로 최대 힙으로 정렬 지정
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 명령어 목록을 하나씩 순회하면서 해당하는 작업 수행
        for (String operation : operations) {
            // 띄어쓰기를 기준으로 명령과 값 분리
            String[] op = operation.split(" ");
            // 삽입 연산
            if ("I".equals(op[0])) {
                minHeap.add(Integer.valueOf(op[1]));
                maxHeap.add(Integer.valueOf(op[1]));
            // 추출 연산
            } else if ("D".equals(op[0])) {
                // 값이 1인 경우 최댓값 추출
                if ("1".equals(op[1])) {
                    minHeap.remove(maxHeap.poll());
                // 값이 -1인 경우 최솟값 추출
                } else if ("-1".equals(op[1])) {
                    maxHeap.remove(minHeap.poll());
                }
            }
        }

        // 최종결과인 최댓값과 최솟값 추출
        Integer maxValue = maxHeap.poll();
        Integer minValue = minHeap.poll();

        // 값이 없다면 0, 아니라면 해당 값으로 리턴
        return new int[]{
                (maxValue == null) ? 0 : maxValue,
                (minValue == null) ? 0 : minValue};
    }

    public static void main(String[] args) {
        solution(new String[]{"I 1", "I 2", "I 3", "D 1", "D -1", "D 1", "D -1"});
    }

    // 정확성  테스트
    // 테스트 1 〉	통과 (0.51ms, 77.1MB)
    //테스트 2 〉	통과 (0.47ms, 73.3MB)
    //테스트 3 〉	통과 (0.48ms, 75.2MB)
    //테스트 4 〉	통과 (0.43ms, 76.9MB)
    //테스트 5 〉	통과 (0.46ms, 86.5MB)
    //테스트 6 〉	통과 (0.80ms, 78.1MB)
    //테스트 7 〉	통과 (96.00ms, 119MB)
    //테스트 8 〉	통과 (0.55ms, 71.4MB)
    //테스트 9 〉	통과 (0.48ms, 77.1MB)
    //테스트 10 〉	통과 (0.51ms, 75.6MB)
}