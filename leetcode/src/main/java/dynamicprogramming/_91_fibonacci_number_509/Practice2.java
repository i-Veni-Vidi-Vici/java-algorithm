package dynamicprogramming._91_fibonacci_number_509;

public class Practice2 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[n];
    }

    // 0ms
}
