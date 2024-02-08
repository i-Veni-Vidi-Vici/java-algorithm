package linear.array.arraypartition561;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1_1 {
    public int arrayPairSum(int[] nums) {
        List<Integer> numbers = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.sort(numbers);
        int result = 0;

        for (int i = 0; i < numbers.size(); i += 2) {
            result += Math.min(numbers.get(i), numbers.get(i+1));
        }

        return result;
    }

    // 52ms
}
