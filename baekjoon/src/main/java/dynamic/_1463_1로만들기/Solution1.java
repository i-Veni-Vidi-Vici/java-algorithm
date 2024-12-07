package dynamic._1463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int[] dp = new int[n + 1];

            // dp[1]은 이미 1이므로 연산 필요 없음
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + 1;  // 1을 빼는 경우

                if (i % 2 == 0) {  // 2로 나누어 떨어지는 경우
                    dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                }
                if (i % 3 == 0) {  // 3으로 나누어 떨어지는 경우
                    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                }
            }

            System.out.println(dp[n]);
        }
    }
    // 120ms
}
