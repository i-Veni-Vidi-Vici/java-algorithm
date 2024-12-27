package dynamic._1003_피보나치_함수;

import java.util.Scanner;

public class Solution1 {

    public class Main {
        // 각 N에 대한 0과 1의 호출 횟수를 저장할 배열
        static int[][] dp = new int[41][2];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 기본 케이스에 대한 호출 횟수 초기화
            dp[0][0] = 1; // N=0일 때 0의 호출 횟수
            dp[0][1] = 0; // N=0일 때 1의 호출 횟수
            dp[1][0] = 0; // N=1일 때 0의 호출 횟수
            dp[1][1] = 1; // N=1일 때 1의 호출 횟수

            // 2부터 40까지의 호출 횟수 계산
            for (int i = 2; i <= 40; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0]; // 0의 호출 횟수는 이전 두 수의 0 호출 횟수의 합
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1]; // 1의 호출 횟수는 이전 두 수의 1 호출 횟수의 합
            }

            int T = sc.nextInt(); // 테스트 케이스의 개수

            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                System.out.println(dp[N][0] + " " + dp[N][1]);
            }

            sc.close();
        }
    }
}
