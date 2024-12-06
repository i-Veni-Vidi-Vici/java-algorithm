package dynamic._2839_설탕배달;

import java.io.*;

public class Solution1 {
    public static int practice(int n) {
        int result = 0;

        // 5로 나눠가면서 3으로 나누어 떨어지는지 확인
        while (n >= 0) {
            if (n % 5 == 0) {    // 5로 나누어 떨어지는 경우
                result += n / 5;
                return result;
            }
            n -= 3;              // 3kg 봉지 하나 사용
            result++;            // 봉지 개수 증가
        }

        return -1;  // 정확하게 만들 수 없는 경우
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(practice(n));
    }

    // 108ms
}
