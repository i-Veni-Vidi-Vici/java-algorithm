package slidingwindow._82_minimum_window_substring_76;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice1 {
    public String minWindow(String s, String t) {
        int length = t.length();
        char[] sValue = s.toCharArray();
        List<Character> tValue = new ArrayList<>();
        for (char c : t.toCharArray()) {
            tValue.add(c);
        }
        while (s.length() >= length) {
            for (int j = 0; j < s.length() - length + 1; j++) {
                Set<Character> result = new HashSet<>();
                for (int i = j; i < j + length; i++) {
                    if (tValue.contains(sValue[i])) {
                        result.add(sValue[i]);
                    }
                }
                if (result.size() == t.length()) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = j; i < i + length; i++) {
                        sb.append(sValue[i]);
                    }
                    return sb.toString();
                }
            }
        }

        return null;
    }
    // Time Limit Exceeded
}
