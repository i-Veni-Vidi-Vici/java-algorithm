package sort._68_valid_anagram_242;

import java.util.Arrays;

public class Practice3 {
    public static boolean isAnagram(String s, String t) {
        char[]  sValue= s.toCharArray();
        Arrays.sort(sValue);
        char[]  tValue= t.toCharArray();
        Arrays.sort(tValue);

        s = new String(sValue);
        t = new String(tValue);

        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    // 2ms
}
