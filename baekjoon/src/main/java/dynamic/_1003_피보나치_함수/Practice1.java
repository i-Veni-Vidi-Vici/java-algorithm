package dynamic._1003_피보나치_함수;

import java.util.*;

public class Practice1 {

    class Main {
        public static void main(String[] args) {

            List<Integer>[] dp = new List[41];

            dp[0] = List.of(1, 0);
            dp[1] = List.of(0, 1);

            for (int i = 2; i <= 40; i++) {
                dp[i] = List.of(dp[i - 1].get(0) + dp[i - 2].get(0), dp[i - 1].get(1) + dp[i - 2].get(1));
            }

            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                System.out.println(dp[N].get(0) + " " + dp[N].get(1));
            }

        }
    }
    // 212ms
}
