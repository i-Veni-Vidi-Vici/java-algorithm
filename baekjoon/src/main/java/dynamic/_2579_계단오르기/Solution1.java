package dynamic._2579_계단오르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution1 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 계단의 개수 입력
            int n = Integer.parseInt(br.readLine());

            int[] stairs = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                stairs[i] = Integer.parseInt(br.readLine());
            }

            int[][] dp = new int[n + 1][3];

            if (n >= 1) {
                dp[1][1] = stairs[1];
            }

            for (int i = 2; i <= n; i++) {
                dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + stairs[i];

                dp[i][2] = dp[i - 1][1] + stairs[i];
            }

            System.out.println(Math.max(dp[n][1], dp[n][2]));

            br.close();
        }
        // 104ms
    }
}
