package linear.array.threesum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> num = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(1));
        boolean isCheck = true;
        for (int i = 0; i < num.size(); i++) {
            for (int j = i+1; j < num.size(); j++) {
                if (num.subList(j+1,num.size()).contains((num.get(i) + num.get(j)) * -1)) {
                    for (List<Integer> result : results) {
                        if (result.containsAll(List.of(nums[i], nums[j], (num.get(i) + num.get(j)) * -1)) &&
                                List.of(nums[i], nums[j], (num.get(i) + num.get(j)) * -1).containsAll(result)) {
                            isCheck = false;
                            break;
                        }
                    }
                    if (isCheck) {
                        results.add(List.of(nums[i], nums[j],(num.get(i) + num.get(j)) * -1));
                    }
                    isCheck = true;
                }

            }
        }

        results.remove(0);
        return results;
    }

    // time limit

}
