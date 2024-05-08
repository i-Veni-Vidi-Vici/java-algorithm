package sort.binarysearch._75_입국심사;

import java.util.Arrays;

public class Solution1 {
    public static long solution(int n, int[] times) {
        long answer = 0;

        long left = 1;
        // 맨 오른쪽은 (입력값 중 가장 큰 값 * n)을 가능한 최댓값으로 설정
        long right = (long) Arrays.stream(times).max().getAsInt() * n;
        // 초기 중앙값은 맨 오른쪽 값으로 설정
        long mid = right;

        while (left <= right) {
            long calcN = 0;
            // 소요 시간(중앙값)을 각 심사관의 시간으로 나누고 합산한 값 계산
            for (long time : times)
                calcN += (mid / time);

            // 합산값이 기다리는 사람 수보다 더 크거나 일치하면 중앙값(소요 시간)을 정답으로 설정
            if (calcN >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            // 중앙값 계산
            mid = left + (right - left) / 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(6, new int[]{7, 10});
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (0.78ms, 75.5MB)
    //테스트 2 〉	통과 (0.82ms, 75.9MB)
    //테스트 3 〉	통과 (2.91ms, 78.4MB)
    //테스트 4 〉	통과 (50.93ms, 81.6MB)
    //테스트 5 〉	통과 (45.90ms, 98.3MB)
    //테스트 6 〉	통과 (54.26ms, 78.2MB)
    //테스트 7 〉	통과 (60.43ms, 85.3MB)
    //테스트 8 〉	통과 (60.49ms, 97.6MB)
    //테스트 9 〉	통과 (0.99ms, 74.5MB)

}
