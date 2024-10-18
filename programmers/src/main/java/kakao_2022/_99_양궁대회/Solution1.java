package kakao_2022._99_양궁대회;
import java.util.*;

public class Solution1 {
    int maxScore = 0;
    int[] info; // 불필요한 파라미터 전달을 없애기 위해 멤버 변수 선언
    int[] answer = new int[11];

    // 점수 차이 계산
    public int calcScore(int[] lion) {
        int diff = 0;
        for (int i = 0; i <= 10; i++) {
            if (lion[i] == 0 && info[i] == 0)
                continue;
            diff = (lion[i] > info[i]) ?
                    diff + (10 - i) : diff - (10 - i);
        }
        return diff;
    }

    public void dfs(int index, int[] lion, int arrow) {
        // 최종 인덱스 도달 시 결과 처리
        if (index == 11) {
            lion[10] = arrow; // 화살이 남아 있다면 모두 10번 인덱스(점수 0)에 부여
            // 점수 차이 계산
            int score = calcScore(lion);
            // 기존 최고 점수 차이를 능가하는 경우 교체
            if (score > maxScore) {
                maxScore = score;
                answer = Arrays.copyOf(lion, lion.length);
            } else if (score == maxScore) { // 점수 차이가 같은 경우
                for (int i = 10; i >= 0; i--) {
                    if (lion[i] == answer[i])
                        continue;
                    // 뒤에서부터 더 많이 맞힌 경우 정답 교체
                    if (lion[i] > answer[i])
                        answer = Arrays.copyOf(lion, lion.length);
                    break;
                }
            }
            return;
        }

        // 어피치보다 화살+1 또는 0 둘 중 하나로 DFS 진행
        if (info[index] < arrow) {
            lion[index] = info[index] + 1;
            dfs(index + 1, lion, arrow - lion[index]);
            lion[index] = 0;
        }
        dfs(index + 1, lion, arrow);
    }

    public int[] solution(int n, int[] info) {
        this.info = info; // 각종 메소드에서 활용하기 위해 멤버 변수에 할당
        dfs(0, new int[11], n);

        // 정답이 없으면 -1 리턴
        if (maxScore == 0)
            return new int[]{-1};
        return answer;
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (0.08ms, 76.9MB)
    //테스트 2 〉	통과 (0.65ms, 72.7MB)
    //테스트 3 〉	통과 (0.66ms, 72.3MB)
    //테스트 4 〉	통과 (0.36ms, 80MB)
    //테스트 5 〉	통과 (0.78ms, 73.6MB)
    //테스트 6 〉	통과 (0.65ms, 80.5MB)
    //테스트 7 〉	통과 (0.34ms, 74.3MB)
    //테스트 8 〉	통과 (0.14ms, 71.6MB)
    //테스트 9 〉	통과 (0.26ms, 75.5MB)
    //테스트 10 〉	통과 (0.11ms, 75.4MB)
    //테스트 11 〉	통과 (0.28ms, 78.3MB)
    //테스트 12 〉	통과 (0.19ms, 82.1MB)
    //테스트 13 〉	통과 (0.62ms, 77MB)
    //테스트 14 〉	통과 (0.61ms, 79.2MB)
    //테스트 15 〉	통과 (0.69ms, 74.7MB)
    //테스트 16 〉	통과 (0.48ms, 76.2MB)
    //테스트 17 〉	통과 (0.39ms, 78.3MB)
    //테스트 18 〉	통과 (0.09ms, 78.2MB)
    //테스트 19 〉	통과 (0.04ms, 76.2MB)
    //테스트 20 〉	통과 (0.67ms, 73.3MB)
    //테스트 21 〉	통과 (0.65ms, 75.8MB)
    //테스트 22 〉	통과 (0.61ms, 77.7MB)
    //테스트 23 〉	통과 (0.10ms, 73.8MB)
    //테스트 24 〉	통과 (3.87ms, 77MB)
    //테스트 25 〉	통과 (0.81ms, 78.9MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
