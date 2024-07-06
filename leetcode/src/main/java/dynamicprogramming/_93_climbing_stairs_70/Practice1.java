package dynamicprogramming._93_climbing_stairs_70;

import java.math.BigInteger;

public class Practice1 {
    public  static int climbStairs(int n) {
        int two =n/2;
        int one =n%2;
        int result=1;
        while (two > 0) {
            result += factorial(one + two).divide(factorial(one).multiply(factorial(two))).intValue() ;
            two--;
            one += 2;
        }

        return result;
    }

    private static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        climbStairs(35);
    }

    // 4ms O(n)
}
