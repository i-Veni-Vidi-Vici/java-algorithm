package dynamicprogramming._397;

public class Solution1 {
    public int integerReplacement(int n) {
        return (int)minOperations((long)n);
    }

    private long minOperations(long n) {
        if (n == 1) return 0;

        if (n % 2 == 0) {
            return 1 + minOperations(n / 2);
        }
        else {
            return 1 + Math.min(minOperations(n + 1),
                    minOperations(n - 1));
        }
        // 6ms
    }
}
