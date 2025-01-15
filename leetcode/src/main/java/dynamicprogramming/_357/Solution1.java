package dynamicprogramming._357;

public class Solution1 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int result = 10;
        int available = 9;
        int current = 9;

        for (int i = 2; i <= n; i++) {
            current = current * available;
            result += current;
            available--;
        }

        return result;
    }
    // 0ms
}
