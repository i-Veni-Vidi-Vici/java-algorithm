package kakao_2022._97_k진수에서소수개수구하기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    // 소수 여부 판별 메소드
    public boolean isPrime(long num) {
        // 1은 소수가 아니며, 2이상인데 2로 나눠지면 소수가 아니므로 미리 처리
        if (num == 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }

        // 3부터 차례대로 나눠지는지 확인
        for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
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
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }
        return answer;
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (10.08ms, 73.8MB)
    //테스트 2 〉	통과 (0.10ms, 78.5MB)
    //테스트 3 〉	통과 (0.34ms, 71.9MB)
    //테스트 4 〉	통과 (0.20ms, 73.8MB)
    //테스트 5 〉	통과 (0.15ms, 76.1MB)
    //테스트 6 〉	통과 (0.14ms, 74.5MB)
    //테스트 7 〉	통과 (0.21ms, 78.1MB)
    //테스트 8 〉	통과 (0.33ms, 72.8MB)
    //테스트 9 〉	통과 (0.27ms, 75.7MB)
    //테스트 10 〉	통과 (0.21ms, 72.5MB)
    //테스트 11 〉	통과 (0.11ms, 75.2MB)
    //테스트 12 〉	통과 (0.20ms, 71.1MB)
    //테스트 13 〉	통과 (0.29ms, 82.6MB)
    //테스트 14 〉	통과 (0.16ms, 81.2MB)
    //테스트 15 〉	통과 (0.13ms, 78.6MB)
    //테스트 16 〉	통과 (0.14ms, 79.4MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
