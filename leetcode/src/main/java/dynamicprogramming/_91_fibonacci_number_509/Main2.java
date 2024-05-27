package dynamicprogramming._91_fibonacci_number_509;

// 반복 상향식
public class Main2 {
    public int fib(int n) {
        int result = 0;
        int number1 =0;
        int numeber2 = 1;

        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            result = numeber2+number1;
            number1 = numeber2;
            numeber2= result;
        }

        return result;
    }

    // 0ms
}
