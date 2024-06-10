package sort._68_valid_anagram_242;

public class Practice2 {
    public boolean isAnagram(String s, String t) {
        int[] origin = new int[26];
        int[] value = new int[26];

        for (char c : s.toCharArray()) {
            origin[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            value[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (origin[i] != value[i]) {
                return false;
            }
        }

        return true;
    }

    // 2ms
}
