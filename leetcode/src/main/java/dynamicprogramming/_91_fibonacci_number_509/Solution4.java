package dynamicprogramming._91_fibonacci_number_509;

// TODO : 두 변수만 이용해 공간 절약
public class Solution4 {
    public int fib(int n) {
        int x = 0, y = 1;
        for (int i = 0; i < n; i++) {
            int z = x + y;
            x = y;
            y = z;
        }
        return x;
    }
    // 0ms
}
