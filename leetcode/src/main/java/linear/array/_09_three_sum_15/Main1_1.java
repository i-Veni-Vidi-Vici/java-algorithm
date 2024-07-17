package linear.array._09_three_sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1_1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> num = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.sort(num);

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if (i > 0 && num.get(i) == num.get(i - 1))
                continue;
            for (int j = i+1; j < num.size(); j++) {
                if (j > i + 1 && num.get(j) == num.get(j - 1))
                    continue;
                if (num.subList(j+1,num.size()).contains((num.get(i) + num.get(j)) * -1)) {
                    results.add(List.of(num.get(i), num.get(j),(num.get(i) + num.get(j)) * -1));
                }

            }
        }

        return results;
    }

    // time limit

}
