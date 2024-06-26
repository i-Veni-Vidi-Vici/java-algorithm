package slidingwindow._83_longest_repeating_character_replacement_424;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> value = new HashMap<>();
        int left = 0;
        int right = 0;
        int result = Integer.MIN_VALUE;
        int sum =k;

        for (char c : s.toCharArray()) {
            if (sum>=0) {
                value.putIfAbsent(c, 0);
                value.put(c, value.get(c) + 1);
                right++;
            }else {

                left++;
            }



        }

        return result;
    }
    // error
}
