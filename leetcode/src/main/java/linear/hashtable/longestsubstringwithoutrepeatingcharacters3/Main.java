package linear.hashtable.longestsubstringwithoutrepeatingcharacters3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int sum =0;
        int max =0;

        for (char c : s.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                map.put(c, 1);
                sum ++;

            }

            if (max < sum) {
                max =sum;
            }
        }

        return max;

    }

    //error
}
