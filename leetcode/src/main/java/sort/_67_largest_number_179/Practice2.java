package sort._67_largest_number_179;

import java.math.BigInteger;
import java.util.*;

public class Practice2 {
    public String largestNumber(int[] nums) {
        int checked =0;
        for (int num : nums) {
            if(num != 0){
                checked = 0;
                break;
            }
            checked++;
        }
        if (checked > 0) {
            return "0";
        }

        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, (o1, o2) -> {
            if (o1 < 10 && o2 < 10) {
                return o2 - o1;
            } else {
                String num1 = o1.toString() + o2.toString();
                String num2 = o2.toString() + o1.toString();

                return new BigInteger(num2).compareTo(new BigInteger(num1));
            }
        });

        StringBuilder sb = new StringBuilder();

        for (Integer num : integerArray) {
            sb.append(num);
        }

        return sb.toString();
    }
    // 13ms
}
