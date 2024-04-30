package sort._68_valid_anagram_242;

import java.util.Arrays;

public class Main1 {
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return String.valueOf(sArray).equals(String.valueOf(tArray));
    }

    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }

    // 3ms
}
