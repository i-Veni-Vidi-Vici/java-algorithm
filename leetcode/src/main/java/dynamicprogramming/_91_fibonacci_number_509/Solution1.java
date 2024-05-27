package dynamicprogramming._91_fibonacci_number_509;

// 재귀 브루트포스
public class Solution1 {
    public int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    // 8ms
}
