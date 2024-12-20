package dynamic._9095_123더하기;

import java.util.Scanner;

public class Solution1 {

    public class Main {
        // 동적 프로그래밍으로 1,2,3의 합으로 나타내는 방법의 수를 계산하는 메소드
        public static int countWays(int n) {
            int[] dp = new int[11]; // n은 11보다 작으므로 크기 11의 배열 생성

            // 기본 케이스 초기화
            dp[1] = 1;  // 1
            dp[2] = 2;  // 1+1, 2
            dp[3] = 4;  // 1+1+1, 1+2, 2+1, 3

            // 4부터 n까지의 경우의 수 계산
            for (int i = 4; i <= n; i++) {
                // i를 만드는 방법의 수는
                // (i-1)에 1을 더하는 경우
                // (i-2)에 2를 더하는 경우
                // (i-3)에 3을 더하는 경우
                // 의 합과 같음
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            return dp[n];
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 테스트 케이스의 개수 입력
            int T = sc.nextInt();

            // 각 테스트 케이스 처리
            for (int i = 0; i < T; i++) {
                int n = sc.nextInt();
                System.out.println(countWays(n));
            }

            sc.close();
        }
    }
    // 168ms
}
