package bitmanipulation._78_sum_of_two_integers_371;

public class Main1 {
    public static int getSum(int a, int b) {
        int result = 0;
        int carry = 0;

        for (int i = 0; i < 32; i++) {
            int num1 = a & (1 << i);
            int num2 = b & (1 << i);

            result ^= (num1 ^ num2) ^ carry;

            if (((num1 &num2) | (num1 & carry) | (num2 & carry)) > 0) {
                carry = (1 << (i+1));
            } else {
                carry = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        getSum(2, 3);
    }

    // 0ms
}
