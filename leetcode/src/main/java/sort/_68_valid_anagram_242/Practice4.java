package sort._68_valid_anagram_242;

import java.util.Arrays;

public class Practice4 {
    public boolean isAnagram(String s, String t) {
        char[] valueS = s.toCharArray();
        Arrays.sort(valueS);
        char[] valueT = t.toCharArray();
        Arrays.sort(valueT);
        return new String(valueS).equals(new String (valueT));
    }

    // 2ms
}
