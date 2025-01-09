package dynamic._2579_계단오르기;

import java.util.Scanner;

public class Practice1 {
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();

            int[] stairs = new int[count];
            for (int i = 0; i < count; i++) {
                stairs[i] = sc.nextInt();
            }
            int dp[] = new int[count];
            dp[0] = stairs[0];
            dp[1] = stairs[1];
            dp[2] = stairs[0] + stairs[2];
            int three = 2;
            for (int i = 2; i < count; i++) {
                if (three == 2) {
                    dp[i] = dp[i - 2] + stairs[i];
                } else {
                    if (Math.max(dp[i - 1], dp[i - 2]) == dp[i - 1]) {
                        three++;
                    }
                    dp[i] = Math.max(dp[i - 1], dp[i - 2]) + stairs[i];
                }
            }

            System.out.println(dp[count - 1]);
        }
    }
    // error
}
