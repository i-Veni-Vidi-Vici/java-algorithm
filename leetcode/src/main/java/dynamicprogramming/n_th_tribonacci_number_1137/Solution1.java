package dynamicprogramming.n_th_tribonacci_number_1137;

public class Solution1 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        // 처음 3개의 수를 초기화합니다
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn = 0;

        // n번째 수까지 계산합니다
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;  // 이전 3개의 수를 더합니다
            t0 = t1;           // 값들을 한 칸씩 이동합니다
            t1 = t2;
            t2 = tn;
        }

        return tn;
    }

    // 0ms
}
