package bitmanipulation._78_sum_of_two_integers_371;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static int getSum(int a, int b) {

        char[] a1 = new StringBuilder(Integer.toBinaryString(a)).reverse().toString().toCharArray();
        char[] b1 = new StringBuilder(Integer.toBinaryString(b)).reverse().toString().toCharArray();
        int index = 0;
        int carry = 0;
        String result = "";
        while (index < a1.length && index < b1.length) {
            int value1 = Character.getNumericValue(a1[index]);
            int value2 = Character.getNumericValue(b1[index]);

            if ((value1 ^ value2 ^ carry) > 0) {
                result+=1;
            } else result += 0;
            if (((value1 & value2) | ((value1 | value2) & carry)) > 0) {
                carry =1;
            }
            else carry=0;
            index++;
        }
        while (a1.length - 1 >= index) {
            if ((Character.getNumericValue(a1[index]) ^ carry) > 0) {
                result+=1;
            } else result += 0;
            if ((Character.getNumericValue(a1[index]) & carry) > 0) {
                carry =1;
            }
            else carry=0;
            index++;
        }
        while (b1.length - 1 >= index) {
            if ((Character.getNumericValue(b1[index]) ^ carry) > 0) {
                result+=1;
            } else result += 0;
            if ((Character.getNumericValue(b1[index]) & carry) > 0) {
                carry =1;
            }
            else carry=0;
            index++;
        }
        if (a < 0 || b < 0) {
            if (carry != 1) {

            }
        } else if (carry == 1) {
            result += 1;
        }

        return (int)Long.parseLong(new StringBuilder(result).reverse().toString(), 2);
    }

    public static void main(String[] args) {
        getSum(-12, -8);
    }

    // 2ms
}
