package linear.hashtable._32_longest_substring_without_repeating_characters_3;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max =0;
        int result =0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                result ++;
            }else {
                map.clear();
                map.put(c, 1);
                max = Math.max(max, result);
                result = 1;
            }
        }


        return Math.max(max, result);
    }
    // Wrong Answer
    //407 / 987 testcases passed
}
