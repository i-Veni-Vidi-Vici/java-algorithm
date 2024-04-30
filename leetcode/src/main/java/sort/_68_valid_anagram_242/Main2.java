package sort._68_valid_anagram_242;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : tArray) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c)+1);
        }

        for (char c : sArray) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        for (Integer value : map.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }
    // 17 ms
}
