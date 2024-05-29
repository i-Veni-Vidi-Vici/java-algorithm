package dynamicprogramming._93_climbing_stairs_70;

public class Main {
    public int climbStairs(int n) {
        int result =0;

        for (int i = 1; i*2 <= n; i++) {
            int div =1;
            int sum =1;
            for (int j = 1; j <= n-i ; j++) {
                sum *= j;
            }
            if (n - i - i == 0) {
                return result +2;
            }
            for (int j = 1; j <= n-i-i; j++) {
                div *=j;
            }
            result += sum / div;

        }

        return result+1;
    }

    // error
}
