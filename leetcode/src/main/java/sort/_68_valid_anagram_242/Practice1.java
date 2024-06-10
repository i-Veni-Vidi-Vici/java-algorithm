package sort._68_valid_anagram_242;

import java.util.Arrays;

public class Practice1 {
    public boolean isAnagram(String s, String t) {
        char[] origin = s.toCharArray();
        char[] value = t.toCharArray();
        Arrays.sort(origin);
        Arrays.sort(value);
        return new String(origin).equals(new String(value));
    }
    // 9ms -> 2ms, Arrays.toString()-> new String()
}
