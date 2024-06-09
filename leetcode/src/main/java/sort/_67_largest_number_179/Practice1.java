package sort._67_largest_number_179;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class Practice1 {
    public String largestNumber(int[] nums) {

        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a= String.valueOf(o1)+ String.valueOf(o2);
                String b= String.valueOf(o2)+ String.valueOf(o1);

//                return Integer.parseInt(b)-Integer.parseInt(a);
                return new BigInteger(b).compareTo(new BigInteger(a));
            }

        });

        StringBuilder result = new StringBuilder();
        for (Integer i : integerArray) {
            result.append(i);
        }


        return new BigInteger(result.toString()).toString();
    }
    //18ms
}
