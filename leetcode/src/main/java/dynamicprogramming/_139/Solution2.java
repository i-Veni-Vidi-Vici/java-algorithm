package dynamicprogramming._139;

import java.util.*;
public class Solution2 {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, 0);
    }

    private boolean dfs(String s, List<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        for (String word : wordDict) {
            if (start + word.length() <= s.length()) {
                String sub = s.substring(start, start + word.length());

                if (sub.equals(word)) {
                    if (dfs(s, wordDict, start + word.length())) {
                        memo.put(start, true);
                        return true;
                    }
                }
            }
        }

        memo.put(start, false);
        return false;
    }
    // 2ms
}
