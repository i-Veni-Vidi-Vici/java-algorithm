package dynamicprogramming._131;

import java.util.*;

public class Practice2 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(result, s, new ArrayList<>(), 0);

        return result;
    }

    private void dfs(List<List<String>> result, String s, List<String> current, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s.substring(start, i + 1))) {
                current.add(s.substring(start, i + 1));
                dfs(result, s, current, i + 1);
                current.remove(current.size() - 1);
            }
        }

    }

    private boolean isPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int cur = len / 2;
        while (cur > 0) {
            if (s.charAt(start) != s.charAt(len - 1)) {
                return false;
            }
            start++;
            cur--;
            len--;
        }

        return true;
    }
    // 9ms
}
