package sort._68_valid_anagram_242;

import java.util.Arrays;

public class Practice1 {
    public boolean isAnagram(String s, String t) {
        char[] origin = s.toCharArray();
        char[] value = t.toCharArray();
        Arrays.sort(origin);
        Arrays.sort(value);
        return Arrays.toString(origin).equals(Arrays.toString(value));
    }
    // 9ms
}
