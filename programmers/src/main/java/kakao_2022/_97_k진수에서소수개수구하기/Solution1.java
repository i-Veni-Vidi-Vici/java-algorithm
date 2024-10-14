package kakao_2022._97_k진수에서소수개수구하기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    // 소수 여부 판별 메소드
    public boolean isPrime(int num) {
        // 1은 소수가 아니므로 예외 처리
        if (num == 1) {
            return false;
        }

        // 3부터 차례대로 나눠지는지 확인
        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n, int k) {
        // 입력의 역순으로 추출해야 변환된 수가 완성되므로 스택 선언
        Deque<Integer> stack = new ArrayDeque<>();
        int remainder;
        // k진수로 자릿수 단위로 변환하면서 스택 삽입
        while (n != 0) {
            remainder = n % k;
            n /= k;
            stack.push(remainder);
        }

        // 스택에서 추출하여 변환 완성
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // 0을 기준으로 구분하여 각각 소수 여부 처리
        int answer = 0;
        for (String s : sb.toString().split("0")) {
            // 00인 경우 빈 값이 될 수 있으므로 예외 처리
            if (s.equals("")) {
                continue;
            }
            // 소수인 경우 정답 +1
            if (isPrime(Integer.parseInt(s))) {
                answer++;
            }
        }
        return answer;
    }
    // 정확성  테스트
    //테스트 1 〉	실패 (런타임 에러)
    //테스트 2 〉	통과 (0.09ms, 70MB)
    //테스트 3 〉	통과 (0.13ms, 75.2MB)
    //테스트 4 〉	통과 (0.16ms, 79.4MB)
    //테스트 5 〉	통과 (0.18ms, 74.8MB)
    //테스트 6 〉	통과 (0.18ms, 74.2MB)
    //테스트 7 〉	통과 (0.13ms, 77.7MB)
    //테스트 8 〉	통과 (0.23ms, 78.4MB)
    //테스트 9 〉	통과 (0.14ms, 76.1MB)
    //테스트 10 〉	통과 (0.14ms, 84.9MB)
    //테스트 11 〉	실패 (런타임 에러)
    //테스트 12 〉	통과 (0.16ms, 73MB)
    //테스트 13 〉	통과 (0.26ms, 76.4MB)
    //테스트 14 〉	통과 (0.06ms, 72.7MB)
    //테스트 15 〉	통과 (0.09ms, 73.9MB)
    //테스트 16 〉	통과 (0.17ms, 78MB)
    //채점 결과
    //정확성: 86.9
    //합계: 86.9 / 100.0
}
