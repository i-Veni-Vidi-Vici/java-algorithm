package kakao_2022._97_k진수에서소수개수구하기;

public class Solution4 {
    // 소수 여부 판별 메소드
    public boolean isPrime(long num) {
        // 1은 소수가 아니며, 2이상인데 2로 나눠지면 소수가 아니므로 미리 처리
        if (num == 1 || (num > 2 && num % 2 == 0))
            return false;

        // 3부터 차례대로 나눠지는지 확인
        for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int solution(int n, int k) {
        // k 진수 문자열로 변환
        String str = Integer.toString(n, k);

        // 0을 기준으로 구분하여 각각 소수 여부 처리
        int answer = 0;
        for (String s : str.split("0")) {
            // 00인 경우 빈 값이 될 수 있으므로 예외 처리
            if (s.equals(""))
                continue;
            // 소수인 경우 정답 +1
            if (isPrime(Long.parseLong(s)))
                answer++;
        }
        return answer;
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (8.41ms, 67.1MB)
    //테스트 2 〉	통과 (0.09ms, 75.4MB)
    //테스트 3 〉	통과 (0.15ms, 71.6MB)
    //테스트 4 〉	통과 (0.12ms, 78MB)
    //테스트 5 〉	통과 (0.15ms, 76.3MB)
    //테스트 6 〉	통과 (0.14ms, 79.7MB)
    //테스트 7 〉	통과 (0.17ms, 75.1MB)
    //테스트 8 〉	통과 (0.12ms, 77.5MB)
    //테스트 9 〉	통과 (0.23ms, 72.5MB)
    //테스트 10 〉	통과 (0.17ms, 73.4MB)
    //테스트 11 〉	통과 (0.10ms, 78.5MB)
    //테스트 12 〉	통과 (0.11ms, 76.8MB)
    //테스트 13 〉	통과 (0.13ms, 83.7MB)
    //테스트 14 〉	통과 (0.06ms, 74.6MB)
    //테스트 15 〉	통과 (0.09ms, 79.8MB)
    //테스트 16 〉	통과 (0.06ms, 75.8MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
