package linear.array.threesum15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(1));
        boolean isCheck = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        for (List<Integer> result : results) {
                            if (result.containsAll(List.of(nums[i], nums[j], nums[k])) &&
                                    List.of(nums[i], nums[j], nums[k]).containsAll(result)) {
                                isCheck = false;
                                break;
                            }
                        }
                        if (isCheck) {
                            results.add(List.of(nums[i], nums[j], nums[k]));
                        }
                        isCheck = true;
                    }
                }
            }
        }
        results.remove(0);

        return results;
    }

    // time limit

}
