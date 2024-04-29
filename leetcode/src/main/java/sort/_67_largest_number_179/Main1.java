package sort._67_largest_number_179;

import java.math.BigInteger;

public class Main1 {
    public static String largestNumber(int[] nums) {
        BigInteger bigInteger = new BigInteger(String.valueOf(nums[0]));
        for (int i = 1; i < nums.length; i++) {
            BigInteger first = new BigInteger(bigInteger.toString() + nums[i]);
            BigInteger second = new BigInteger(nums[i] + bigInteger.toString());
            if (first.compareTo(second)>0) {
                bigInteger = second;
            } else {
                bigInteger = first;
            }
        }

        return bigInteger.toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        largestNumber(new int[]{3, 30, 34, 5, 9});
    }
    // error
}
