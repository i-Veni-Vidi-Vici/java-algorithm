package dynamicprogramming._22;

import java.util.*;

public class Solution1 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // 현재 문자열의 길이가 2n이 되면 결과에 추가
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // 여는 괄호의 개수가 n보다 작으면 여는 괄호 추가 가능
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // 닫는 괄호의 개수가 여는 괄호보다 작으면 닫는 괄호 추가 가능
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    // 2ms
}
