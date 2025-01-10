package dynamic._2775_부녀회장이_될테야;

import java.util.Scanner;

public class Practice1 {

    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            for (int r = 0; r < t; r++) {
                int k = sc.nextInt();
                int n = sc.nextInt();

                int[][] dp = new int[k + 1][n];
                for (int i = 0; i < n; i++) {
                    dp[0][i] = i + 1;
                }
                for (int i = 0; i < k + 1; i++) {
                    dp[i][0] = 1;
                }

                for (int i = 1; i < k + 1; i++) {
                    for (int j = 1; j < n; j++) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }

                System.out.println(dp[k][n - 1]);


            }

        }
    }
    // 196ms
}
