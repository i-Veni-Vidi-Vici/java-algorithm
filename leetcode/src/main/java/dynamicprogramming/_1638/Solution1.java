package dynamicprogramming._1638;

public class Solution1 {
    public int countSubstrings(String s, String t) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                int diff = 0;
                for (int k = 0; i + k < s.length() && j + k < t.length(); k++) {
                    if (s.charAt(i + k) != t.charAt(j + k)) {
                        diff++;
                    }
                    if (diff == 1) {
                        result++;
                    }
                    if (diff > 1) {
                        break;
                    }
                }
            }
        }

        return result;
    }
    // 9ms
}
