package kakao_2022._97_k진수에서소수개수구하기;

public class Practice2 {
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        String[] value = sb.reverse().toString().split("0");

        int result = 0;
        for (int i = 0; i < value.length; i++) {
            if (!value[i].isBlank()) {
                long num = Long.parseLong(value[i]);
                if (num == 2 || num == 3) {
                    result++;
                    continue;
                }
                if (num % 2 == 0 || num == 1) {
                    continue;
                }
                boolean check = true;
                for (int j = 3; (j * j) <= num; j += 2) {
                    if (num % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    result++;
                }
            }
        }

        return result;
    }
    // 정확성  테스트
    //테스트 1 〉	실패 (시간 초과)
    //테스트 2 〉	통과 (0.08ms, 76.8MB)
    //테스트 3 〉	통과 (0.13ms, 84.9MB)
    //테스트 4 〉	통과 (0.11ms, 71.6MB)
    //테스트 5 〉	통과 (0.16ms, 65.7MB)
    //테스트 6 〉	통과 (0.12ms, 74.6MB)
    //테스트 7 〉	통과 (0.14ms, 79.2MB)
    //테스트 8 〉	통과 (0.15ms, 72.9MB)
    //테스트 9 〉	통과 (0.14ms, 78.3MB)
    //테스트 10 〉	통과 (0.13ms, 76.6MB)
    //테스트 11 〉	통과 (0.08ms, 75.6MB)
    //테스트 12 〉	통과 (0.19ms, 75.7MB)
    //테스트 13 〉	통과 (0.14ms, 76.9MB)
    //테스트 14 〉	통과 (0.09ms, 81MB)
    //테스트 15 〉	통과 (0.10ms, 67.6MB)
    //테스트 16 〉	통과 (0.07ms, 77.4MB)
    //채점 결과
    //정확성: 88.1
    //합계: 88.1 / 100.0
}
