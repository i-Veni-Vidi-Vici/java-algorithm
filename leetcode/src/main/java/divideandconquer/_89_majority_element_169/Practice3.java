package divideandconquer._89_majority_element_169;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> value = new HashMap<>();
        for(int num : nums){
            value.put(num, value.getOrDefault(num, 0)+1);
        }

        return value.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();
    }

    // 15ms
}
