package dynamic._11726_2xn_타일링;

import java.io.*;

public class Solution1 {
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            // n이 1이하인 경우 바로 결과 반환
            if (n <= 1) {
                System.out.println(1);
                return;
            }

            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            }

            System.out.println(dp[n]);
        }
        // 104ms
    }
}
