package dynamicprogramming._91_fibonacci_number_509;

public class Practice1 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
    // 8ms
}
